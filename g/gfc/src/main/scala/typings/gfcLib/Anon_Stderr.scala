package typings
package gfcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stderr extends js.Object {
  var stderr: java.lang.String | nodeLib.Buffer
  var stdout: java.lang.String | nodeLib.Buffer
}

object Anon_Stderr {
  @scala.inline
  def apply(stderr: java.lang.String | nodeLib.Buffer, stdout: java.lang.String | nodeLib.Buffer): Anon_Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Stderr]
  }
}

