package typings.ensureDashError.ensureDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ensure-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Ensures a value is a valid error by making it one if not.
  If `input` is an `Error`, any missing `Error` properties will be added.
  If it's not an `Error`, `input` is converted to an `Error`.
  @example
  ```
  import ensureError = require('ensure-error');
  const error = new TypeError('🦄');
  error.name = '';
  console.log(error.name);
  //=> ''
  console.log(ensureError(error).name);
  //=> 'TypeError'
  console.log(ensureError(10));
  //=> [NonError: 10]
  ```
  */
  def apply[T](input: T): NonError | T = js.native
}

