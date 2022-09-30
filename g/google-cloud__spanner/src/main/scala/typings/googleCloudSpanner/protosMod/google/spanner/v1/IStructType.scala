package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.spanner.v1.StructType.IField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StructType. */
trait IStructType extends StObject {
  
  /** StructType fields */
  var fields: js.UndefOr[js.Array[IField] | Null] = js.undefined
}
object IStructType {
  
  inline def apply(): IStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStructType]
  }
  
  extension [Self <: IStructType](x: Self) {
    
    inline def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
