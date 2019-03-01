package typings
package enigmaDotJsLib

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
  def create(config: enigmaDotJsLib.enigmaJSNs.IConfig): enigmaDotJsLib.enigmaJSNs.ISession
}

object IEnigmaClass {
  @scala.inline
  def apply(create: js.Function1[enigmaDotJsLib.enigmaJSNs.IConfig, enigmaDotJsLib.enigmaJSNs.ISession]): IEnigmaClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[IEnigmaClass]
  }
}

