package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldMask. */
trait IFieldMask extends StObject {
  
  /** FieldMask paths */
  var paths: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IFieldMask {
  
  @scala.inline
  def apply(): IFieldMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldMask]
  }
  
  @scala.inline
  implicit class IFieldMaskMutableBuilder[Self <: IFieldMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsNull: Self = StObject.set(x, "paths", null)
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
