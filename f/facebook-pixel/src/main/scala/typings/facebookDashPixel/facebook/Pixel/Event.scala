package typings.facebookDashPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  def apply(eventType: String, InitialAppId: String): Unit = js.native
  def apply(
    eventType: String,
    InitialAppId: String,
    eventName: String,
    parameters: ViewContentParameters | SearchParameters | AddToCartParameters | AddToWishlistParameters | InitiateCheckoutParameters | AddPaymentInfoParameters | PurchaseParameters | LeadParameters | CompleteRegistrationParameters
  ): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: AddPaymentInfoParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: AddToCartParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: AddToWishlistParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: CompleteRegistrationParameters): Unit = js.native
  def apply(
    eventType: String,
    eventName: String,
    parameters: typings.facebookDashPixel.facebook.Pixel.DPA.AddToCartParameters
  ): Unit = js.native
  def apply(
    eventType: String,
    eventName: String,
    parameters: typings.facebookDashPixel.facebook.Pixel.DPA.PurchaseParameters
  ): Unit = js.native
  def apply(
    eventType: String,
    eventName: String,
    parameters: typings.facebookDashPixel.facebook.Pixel.DPA.ViewContentParameters
  ): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: InitiateCheckoutParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: LeadParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: PurchaseParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: SearchParameters): Unit = js.native
  def apply(eventType: String, eventName: String, parameters: ViewContentParameters): Unit = js.native
}

