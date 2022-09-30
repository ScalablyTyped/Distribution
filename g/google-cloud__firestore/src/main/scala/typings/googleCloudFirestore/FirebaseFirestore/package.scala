package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
// Remap K => Prefix.K. See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html#key-remapping-via-as
{[ K in keyof T & string as / * template literal string: ${Prefix}.${K} * / string ]:? T[K]}
  */ typings.googleCloudFirestore.googleCloudFirestoreStrings.AddPrefixToKeys & TopLevel[T]

type ChildUpdateFields[K /* <: String */, V] = // Recurse into the map and add the prefix in front of each key
// (e.g. Prefix 'bar.' to create: 'bar.baz' and 'bar.qux'.
AddPrefixToKeys[K, UpdateData[V]]

type DocumentData = StringDictionary[Any]

type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @google-cloud/firestore.FirebaseFirestore.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any]

type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? @google-cloud/firestore.FirebaseFirestore.PartialWithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue}
  */ typings.googleCloudFirestore.googleCloudFirestoreStrings.PartialWithFieldValue & TopLevel[T]) | T

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type UnionToIntersection[U] = Any

type UpdateData[T] = Partial[T] | (typings.googleCloudFirestore.googleCloudFirestoreStrings.UpdateData & TopLevel[T] & NestedUpdateFields[T]) | T

type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @google-cloud/firestore.FirebaseFirestore.WithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue}
  */ typings.googleCloudFirestore.googleCloudFirestoreStrings.WithFieldValue & TopLevel[T])
