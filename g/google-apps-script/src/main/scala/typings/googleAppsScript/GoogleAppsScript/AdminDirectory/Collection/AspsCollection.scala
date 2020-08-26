package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Asp
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Asps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AspsCollection extends js.Object {
  // Get information about an ASP issued by a user.
  def get(userKey: String, codeId: Double): Asp = js.native
  // List the ASPs issued by a user.
  def list(userKey: String): Asps = js.native
  // Delete an ASP issued by a user.
  def remove(userKey: String, codeId: Double): Unit = js.native
}

object AspsCollection {
  @scala.inline
  def apply(get: (String, Double) => Asp, list: String => Asps, remove: (String, Double) => Unit): AspsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[AspsCollection]
  }
  @scala.inline
  implicit class AspsCollectionOps[Self <: AspsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, Double) => Asp): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => Asps): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: (String, Double) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
  
}

