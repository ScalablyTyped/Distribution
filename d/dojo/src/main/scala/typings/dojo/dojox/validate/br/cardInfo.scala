package typings.dojo.dojox.validate.br

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/br._cardInfo.html
  *
  * A dictionary list of credit card abbreviations
  * A hash of valid CC abbreviations and regular expressions
  *
  * mc: Mastercard
  * ec: Eurocard
  * vi: Visa
  * ax: American Express
  * dc: Diners Club
  * bl: Carte Blanch
  * di: Discover
  * jcb: JCB
  * er: Enroute
  *
  */
trait cardInfo extends js.Object {
  /**
    *
    */
  var ax: String
  /**
    *
    */
  var bl: String
  /**
    *
    */
  var dc: String
  /**
    *
    */
  var di: String
  /**
    *
    */
  var ec: String
  /**
    *
    */
  var er: String
  /**
    *
    */
  var jcb: String
  /**
    *
    */
  var mc: String
  /**
    *
    */
  var vi: String
}

object cardInfo {
  @scala.inline
  def apply(
    ax: String,
    bl: String,
    dc: String,
    di: String,
    ec: String,
    er: String,
    jcb: String,
    mc: String,
    vi: String
  ): cardInfo = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], bl = bl.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], di = di.asInstanceOf[js.Any], ec = ec.asInstanceOf[js.Any], er = er.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any], vi = vi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[cardInfo]
  }
}

