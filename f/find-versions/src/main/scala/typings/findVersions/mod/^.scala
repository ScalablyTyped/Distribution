package typings.findVersions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-versions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Find semver versions in a string: `unicorn v1.2.3` → `1.2.3`.
  @example
  ```
  import findVersions = require('find-versions');
  findVersions('unicorn v1.2.3 rainbow 2.3.4+build.1');
  //=> ['1.2.3', '2.3.4+build.1']
  findVersions('cp (GNU coreutils) 8.22', {loose: true});
  //=> ['8.22.0']
  ```
  */
  def apply(stringWithVersions: String): js.Array[String] = js.native
  def apply(stringWithVersions: String, options: Options): js.Array[String] = js.native
}

