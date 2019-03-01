package typings
package gapiDotTranslateLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translations extends js.Object {
  /**
  		 * Returns text translations from one language to another.
  		 */
  def list(`object`: gapiDotTranslateLib.Anon_Cid): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateTranslationListResponse]
}

object translations {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotTranslateLib.Anon_Cid, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateTranslationListResponse]
    ]
  ): translations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[translations]
  }
}

