package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Off extends js.Object {
  var default: Anon_Listen
  var filter: js.Function2[
    /* selector */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    stdLib.EventListener
  ]
  var listen: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    js.Function0[scala.Unit]
  ]
  var off: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  var on: js.Function4[
    /* element */ stdLib.Element, 
    /* type */ java.lang.String, 
    /* listener */ stdLib.EventListener, 
    /* capture */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}

