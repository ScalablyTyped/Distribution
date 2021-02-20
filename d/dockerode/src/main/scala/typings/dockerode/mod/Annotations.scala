package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotations extends StObject {
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var Name: js.UndefOr[String] = js.native
}
object Annotations {
  
  @scala.inline
  def apply(): Annotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations]
  }
  
  @scala.inline
  implicit class AnnotationsMutableBuilder[Self <: Annotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
