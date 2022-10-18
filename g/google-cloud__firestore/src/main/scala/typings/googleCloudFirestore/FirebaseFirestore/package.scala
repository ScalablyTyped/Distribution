package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregateFieldType = AggregateField[Double]

type AggregateSpec = StringDictionary[AggregateFieldType]

type DocumentData = StringDictionary[DocumentFieldValue]

type DocumentFieldValue = Any

type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @google-cloud/firestore.FirebaseFirestore.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any]

type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @google-cloud/firestore.FirebaseFirestore.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @google-cloud/firestore.FirebaseFirestore.PartialWithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue} : never */ js.Any)

type Primitive = js.UndefOr[String | Double | Boolean | Null]

type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @google-cloud/firestore.FirebaseFirestore.Primitive ? T : T extends {} ? {[ K in keyof T ]: @google-cloud/firestore.FirebaseFirestore.WithFieldValue<T[K]> | @google-cloud/firestore.FirebaseFirestore.FieldValue} : never */ js.Any)
