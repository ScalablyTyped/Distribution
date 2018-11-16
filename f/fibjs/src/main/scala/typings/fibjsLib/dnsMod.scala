package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief dns 域名查询模块
	* @detail 基础模块，引用方式：,```JavaScript,var dns = require('dns');,```
	*/
@JSImport("dns", JSImport.Namespace)
@js.native
object dnsMod extends js.Object {
  def lookup(name: java.lang.String): java.lang.String = js.native
  def resolve(name: java.lang.String): js.Array[_] = js.native
}

