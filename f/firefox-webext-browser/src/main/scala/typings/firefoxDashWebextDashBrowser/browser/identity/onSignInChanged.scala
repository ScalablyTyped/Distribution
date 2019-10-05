package typings.firefoxDashWebextDashBrowser.browser.identity

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* identity events */
/**
  * Fired when signin state changes for an account on the user's profile.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.identity.onSignInChanged")
@js.native
object onSignInChanged
  extends TopLevel[
      js.UndefOr[
        WebExtEvent[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
      ]
    ]

