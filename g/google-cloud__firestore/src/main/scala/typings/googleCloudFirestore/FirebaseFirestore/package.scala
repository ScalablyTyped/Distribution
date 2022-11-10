package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregateFieldType = AggregateField[Double]

type AggregateSpec = StringDictionary[AggregateFieldType]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Only allow nesting for map values
V extends std.Record<string, unknown> ? // Recurse into the map and add the prefix in front of each key
// (e.g. Prefix 'bar.' to create: 'bar.baz' and 'bar.qux'.
@google-cloud/firestore.FirebaseFirestore.AddPrefixToKeys<K, @google-cloud/firestore.FirebaseFirestore.UpdateData<V>> : // UpdateData is always a map of values.
never
  }}}
  */
type ChildUpdateFields[K /* <: String */, V] = // Recurse into the map and add the prefix in front of each key
// (e.g. Prefix 'bar.' to create: 'bar.baz' and 'bar.qux'.
AddPrefixToKeys[K, UpdateData[V]]

type DocumentData = StringDictionary[DocumentFieldValue]

type DocumentFieldValue = Any

type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @google-cloud/firestore.FirebaseFirestore.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any]

type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @google-cloud/firestore.FirebaseFirestore.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @google-cloud/firestore.FirebaseFirestore.PartialWithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue} : never */ js.Any)

type Primitive = js.UndefOr[String | Double | Boolean | Null]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @google-cloud/firestore.FirebaseFirestore.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @google-cloud/firestore.FirebaseFirestore.UpdateData<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue} & @google-cloud/firestore.FirebaseFirestore.NestedUpdateFields<T> : std.Partial<T>
  }}}
  */
type UpdateData[T] = T

type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @google-cloud/firestore.FirebaseFirestore.Primitive ? T : T extends {} ? {[ K in keyof T ]: @google-cloud/firestore.FirebaseFirestore.WithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue} : never */ js.Any)
