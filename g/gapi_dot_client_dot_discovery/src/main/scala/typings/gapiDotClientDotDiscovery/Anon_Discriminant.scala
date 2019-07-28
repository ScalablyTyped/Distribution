package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Discriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.undefined
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Anon_Ref]] = js.undefined
}

object Anon_Discriminant {
  @scala.inline
  def apply(discriminant: String = null, map: js.Array[Anon_Ref] = null): Anon_Discriminant = {
    val __obj = js.Dynamic.literal()
    if (discriminant != null) __obj.updateDynamic("discriminant")(discriminant)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Anon_Discriminant]
  }
}

