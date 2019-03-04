package typings
package gapiDotTranslateLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detections extends js.Object {
  /**
  		 * Detect the language of text.
  		 */
  def list(`object`: gapiDotTranslateLib.Anon_Fields): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateDetectionListResponse]
}

object detections {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotTranslateLib.Anon_Fields, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotTranslateLib.GoogleApiTranslateDetectionListResponse]
    ]
  ): detections = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[detections]
  }
}

