package typings.dojo.dojox.validate.us

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/us._cardInfo.html
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
trait _cardInfo extends js.Object {
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

object _cardInfo {
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
  ): _cardInfo = {
    val __obj = js.Dynamic.literal(ax = ax, bl = bl, dc = dc, di = di, ec = ec, er = er, jcb = jcb, mc = mc, vi = vi)
  
    __obj.asInstanceOf[_cardInfo]
  }
}

