package typings.execall.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("execall", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Find multiple RegExp matches in a string.
  @param regexp - Regular expression to match against the `string`.
  @returns The matches.
  @example
  ```
  import execall = require('execall');
  execall(/(\d+)/g, '$200 and $400');
  // [
  // 	{
  // 		match: '200',
  // 		subMatches: ['200'],
  // 		index: 1
  // 	},
  // 	{
  // 		match: '400',
  // 		subMatches: ['400'],
  // 		index: 10
  // 	}
  // ]
  ```
  */
  def apply(regexp: RegExp, string: String): js.Array[Match] = js.native
}
