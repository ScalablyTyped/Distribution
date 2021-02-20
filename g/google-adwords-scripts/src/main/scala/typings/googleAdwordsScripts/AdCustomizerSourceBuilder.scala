package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
}
object AdCustomizerSourceBuilder {
  
  @scala.inline
  def apply[AdCustomizerSource](
    addAttribute: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource],
    addAttributes: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource],
    build: () => AdWordsOperation[AdCustomizerSource],
    withName: String => AdCustomizerSourceBuilder[AdCustomizerSource]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addAttributes = js.Any.fromFunction1(addAttributes), build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
  
  @scala.inline
  implicit class AdCustomizerSourceBuilderMutableBuilder[Self <: AdCustomizerSourceBuilder[_], AdCustomizerSource] (val x: Self with AdCustomizerSourceBuilder[AdCustomizerSource]) extends AnyVal {
    
    @scala.inline
    def setAddAttribute(value: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "addAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAttributes(value: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "addAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => AdCustomizerSourceBuilder[AdCustomizerSource]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
