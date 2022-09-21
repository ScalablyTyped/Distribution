package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 数据统计对象，用以构建应用运行时数据收集
  * @detail 创建方法：,```JavaScript,var util = require("util");,var stats = new util.Stats(["begin", "end", "error"]);,```,一些内部对象会提供预先定义的的统计对象
  */
@JSGlobal("Class_Stats")
@js.native
open class ClassStats protected ()
  extends StObject
     with typings.fibjs.ClassStats {
  /**
    * 
    * @brief 数据统计对象构造方法
    * @param keys 指定计数器的名称
    * 
    * 
    * 
    */
  def this(keys: js.Array[Any]) = this()
  /**
    * 
    * @brief 数据统计对象构造方法
    * @param staticKeys 指定静态计数器的名称，静态计数器不会被 reset
    * @param keys 指定计数器的名称
    * 
    * 
    * 
    */
  def this(staticKeys: js.Array[Any], keys: js.Array[Any]) = this()
}
