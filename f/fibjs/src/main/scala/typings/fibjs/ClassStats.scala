package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 数据统计对象，用以构建应用运行时数据收集
  * @detail 创建方法：,```JavaScript,var util = require("util");,var stats = new util.Stats(["begin", "end", "error"]);,```,一些内部对象会提供预先定义的的统计对象
  */
@js.native
trait ClassStats extends ClassObject {
  /**
    * 
    * @brief 指定的计数器加指定值
    * @param key 指定计数器名称
    * @param value 指定数值
    * 
    * 
    * 
    */
  def add(key: String, value: Double): Unit = js.native
  /**
    * 
    * @brief 指定的计数器减一
    * @param key 指定计数器名称
    * 
    * 
    * 
    */
  def dec(key: String): Unit = js.native
  /**
    * 
    * @brief 指定的计数器增一
    * @param key 指定计数器名称
    * 
    * 
    * 
    */
  def inc(key: String): Unit = js.native
  /**
    * 
    * @brief 初始化计数器，除 staticKeys 指定的计数器全部清零
    * 
    * 
    */
  def reset(): Unit = js.native
  /**
    * 
    * @brief 查询上次 reset 到现在的运行时间
    * @return 返回上次 reset 到现在的运行时间
    * 
    * 
    * 
    */
  def uptime(): Double = js.native
}

