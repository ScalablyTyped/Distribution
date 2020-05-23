package typings.fastRedact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-redact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * When called without any options, or with a zero length paths array, fast-redact will return JSON.stringify or the serialize option, if set.
    * @param redactOptions
    * @param redactOptions.paths An array of strings describing the nested location of a key in an object.
    * @param redactOptions.censor This is the value which overwrites redacted properties.
    * @param redactOptions.remove The remove option, when set to true will cause keys to be removed from the serialized output.
    * @param redactOptions.serialize The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object.
    * @param redactOptions.strict The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive.
    * @returns Redacted value from input
    */
  def apply(redactOptions: RedactOptions): redactFn = js.native
}

