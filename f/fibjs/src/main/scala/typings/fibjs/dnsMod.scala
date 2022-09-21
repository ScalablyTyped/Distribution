package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief dns 域名查询模块
  * @detail 基础模块，引用方式：,```JavaScript,var dns = require('dns');,```
  */
object dnsMod {
  
  @JSImport("dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookup(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolve(name: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
