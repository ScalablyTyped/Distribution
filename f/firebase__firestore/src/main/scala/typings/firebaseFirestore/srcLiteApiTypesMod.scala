package typings.firebaseFirestore

import org.scalablytyped.runtime.TopLevel
import typings.firebaseFirestore.srcLiteApiReferenceMod.UpdateData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLiteApiTypesMod {
  
  type AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T & string as '${Prefix}.${K}' ]:? T[K]}
    */ typings.firebaseFirestore.firebaseFirestoreStrings.AddPrefixToKeys & TopLevel[T]
  
  type ChildUpdateFields[K /* <: String */, V] = AddPrefixToKeys[K, UpdateData[V]]
  
  type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/lite-api/types.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any
  ]
  
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  
  type UnionToIntersection[U] = Any
}
