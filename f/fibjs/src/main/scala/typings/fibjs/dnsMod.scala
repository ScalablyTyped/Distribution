package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief dns 域名查询模块
  * @detail 基础模块，引用方式：,```JavaScript,var dns = require('dns');,```
  */
object dnsMod {
  
  @JSImport("dns", "lookup")
  @js.native
  def lookup(name: String): String = js.native
  
  @JSImport("dns", "resolve")
  @js.native
  def resolve(name: String): js.Array[_] = js.native
}
