package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for DriveItemsSelectedActionResponse objects.
  */
trait DriveItemsSelectedActionResponseBuilder extends js.Object {
  def build(): DriveItemsSelectedActionResponse
  def requestFileScope(itemId: String): DriveItemsSelectedActionResponseBuilder
}

object DriveItemsSelectedActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => DriveItemsSelectedActionResponse,
    requestFileScope: String => DriveItemsSelectedActionResponseBuilder
  ): DriveItemsSelectedActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requestFileScope = js.Any.fromFunction1(requestFileScope))
    __obj.asInstanceOf[DriveItemsSelectedActionResponseBuilder]
  }
}

