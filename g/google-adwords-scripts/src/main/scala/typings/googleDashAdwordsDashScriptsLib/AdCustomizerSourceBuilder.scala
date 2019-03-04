package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  def addAttribute(name: java.lang.String, `type`: java.lang.String): AdCustomizerSourceBuilder[AdCustomizerSource]
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource]
  def withName(name: java.lang.String): AdCustomizerSourceBuilder[AdCustomizerSource]
}

object AdCustomizerSourceBuilder {
  @scala.inline
  def apply[AdCustomizerSource](
    addAttribute: js.Function2[java.lang.String, java.lang.String, AdCustomizerSourceBuilder[AdCustomizerSource]],
    addAttributes: js.Function1[js.Object, AdCustomizerSourceBuilder[AdCustomizerSource]],
    build: js.Function0[AdWordsOperation[AdCustomizerSource]],
    withName: js.Function1[java.lang.String, AdCustomizerSourceBuilder[AdCustomizerSource]]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal(addAttribute = addAttribute, addAttributes = addAttributes, build = build, withName = withName)
  
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
}

