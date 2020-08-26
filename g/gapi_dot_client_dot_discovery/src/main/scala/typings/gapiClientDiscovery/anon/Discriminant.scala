package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discriminant extends js.Object {
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.native
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Ref]] = js.native
}

object Discriminant {
  @scala.inline
  def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  @scala.inline
  implicit class DiscriminantOps[Self <: Discriminant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiscriminant(value: String): Self = this.set("discriminant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscriminant: Self = this.set("discriminant", js.undefined)
    @scala.inline
    def setMapVarargs(value: Ref*): Self = this.set("map", js.Array(value :_*))
    @scala.inline
    def setMap(value: js.Array[Ref]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

