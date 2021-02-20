package typings.googleGax.iamServiceMod.google.protobuf

import typings.googleGax.iamServiceMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GeneratedCodeInfo. */
@js.native
trait IGeneratedCodeInfo extends StObject {
  
  /** GeneratedCodeInfo annotation */
  var annotation: js.UndefOr[js.Array[IAnnotation] | Null] = js.native
}
object IGeneratedCodeInfo {
  
  @scala.inline
  def apply(): IGeneratedCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedCodeInfo]
  }
  
  @scala.inline
  implicit class IGeneratedCodeInfoMutableBuilder[Self <: IGeneratedCodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: js.Array[IAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationNull: Self = StObject.set(x, "annotation", null)
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    @scala.inline
    def setAnnotationVarargs(value: IAnnotation*): Self = StObject.set(x, "annotation", js.Array(value :_*))
  }
}
