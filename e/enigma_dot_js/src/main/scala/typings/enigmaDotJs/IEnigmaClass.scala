package typings.enigmaDotJs

import typings.enigmaDotJs.enigmaJSNs.IConfig
import typings.enigmaDotJs.enigmaJSNs.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare const enigmaJS: IEnigmaClass;
// export = enigmaJS;
// export as namespace enigmaJS;
trait IEnigmaClass extends js.Object {
  /**
    * Create a session object.
    * @returns - Returns a session.
    * Note: See Configuration for the configuration options.
    */
  def create(config: IConfig): ISession
}

object IEnigmaClass {
  @scala.inline
  def apply(create: IConfig => ISession): IEnigmaClass = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[IEnigmaClass]
  }
}

