package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Taggable extends StObject {
  
  def addLabels(labels: Labels): Boolean
  
  def setLabel(name: String, value: LabelValue): Boolean
}
object Taggable {
  
  @scala.inline
  def apply(addLabels: Labels => Boolean, setLabel: (String, LabelValue) => Boolean): Taggable = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), setLabel = js.Any.fromFunction2(setLabel))
    __obj.asInstanceOf[Taggable]
  }
  
  @scala.inline
  implicit class TaggableMutableBuilder[Self <: Taggable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLabels(value: Labels => Boolean): Self = StObject.set(x, "addLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabel(value: (String, LabelValue) => Boolean): Self = StObject.set(x, "setLabel", js.Any.fromFunction2(value))
  }
}
