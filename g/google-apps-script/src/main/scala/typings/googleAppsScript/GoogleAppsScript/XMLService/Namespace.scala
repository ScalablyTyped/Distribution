package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML namespace.
  */
trait Namespace extends js.Object {
  def getPrefix(): String
  def getURI(): String
}

object Namespace {
  @scala.inline
  def apply(getPrefix: () => String, getURI: () => String): Namespace = {
    val __obj = js.Dynamic.literal(getPrefix = js.Any.fromFunction0(getPrefix), getURI = js.Any.fromFunction0(getURI))
    __obj.asInstanceOf[Namespace]
  }
}

