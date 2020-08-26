package typings.enigmaJs

import typings.enigmaJs.enigmaJS.IConfig
import typings.enigmaJs.enigmaJS.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare const enigmaJS: IEnigmaClass;
// export = enigmaJS;
// export as namespace enigmaJS;
@js.native
trait IEnigmaClass extends js.Object {
  /**
    * Create a session object.
    * @returns - Returns a session.
    * Note: See Configuration for the configuration options.
    */
  def create(config: IConfig): ISession = js.native
}

object IEnigmaClass {
  @scala.inline
  def apply(create: IConfig => ISession): IEnigmaClass = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IEnigmaClass]
  }
  @scala.inline
  implicit class IEnigmaClassOps[Self <: IEnigmaClass] (val x: Self) extends AnyVal {
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
    def setCreate(value: IConfig => ISession): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

