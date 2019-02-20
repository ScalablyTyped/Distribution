package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  def apply(eventType: java.lang.String, InitialAppId: java.lang.String): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: AddPaymentInfoParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: AddToCartParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: AddToWishlistParameters): scala.Unit = js.native
  def apply(
    eventType: java.lang.String,
    eventName: java.lang.String,
    parameters: CompleteRegistrationParameters
  ): scala.Unit = js.native
  def apply(
    eventType: java.lang.String,
    eventName: java.lang.String,
    parameters: facebookDashPixelLib.facebookNs.PixelNs.DPANs.AddToCartParameters
  ): scala.Unit = js.native
  def apply(
    eventType: java.lang.String,
    eventName: java.lang.String,
    parameters: facebookDashPixelLib.facebookNs.PixelNs.DPANs.PurchaseParameters
  ): scala.Unit = js.native
  def apply(
    eventType: java.lang.String,
    eventName: java.lang.String,
    parameters: facebookDashPixelLib.facebookNs.PixelNs.DPANs.ViewContentParameters
  ): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: InitiateCheckoutParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: LeadParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: PurchaseParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: SearchParameters): scala.Unit = js.native
  def apply(eventType: java.lang.String, eventName: java.lang.String, parameters: ViewContentParameters): scala.Unit = js.native
}

