package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.undefined
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Ref]] = js.undefined
}

object Discriminant {
  @scala.inline
  def apply(discriminant: String = null, map: js.Array[Ref] = null): Discriminant = {
    val __obj = js.Dynamic.literal()
    if (discriminant != null) __obj.updateDynamic("discriminant")(discriminant.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discriminant]
  }
}

