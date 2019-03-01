package typings
package gapiDotPagespeedonlineLib.gapiNs.clientNs.pagespeedonlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pagespeedapi extends js.Object {
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: gapiDotPagespeedonlineLib.Anon_Fields): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotPagespeedonlineLib.GoogleApiPageSpeedOnlineResource]
}

object pagespeedapi {
  @scala.inline
  def apply(
    runpagespeed: js.Function1[
      gapiDotPagespeedonlineLib.Anon_Fields, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotPagespeedonlineLib.GoogleApiPageSpeedOnlineResource]
    ]
  ): pagespeedapi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runpagespeed")(runpagespeed)
    __obj.asInstanceOf[pagespeedapi]
  }
}

