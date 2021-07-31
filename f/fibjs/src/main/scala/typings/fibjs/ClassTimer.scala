package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 定时器处理器对象
  * @detail 
  */
@js.native
trait ClassTimer
  extends StObject
     with ClassObject {
  
  /**
    * 
    * @brief 取消当前定时器
    * 
    * 
    */
  def clear(): Unit = js.native
  
  /**
    * 
    * @brief 维持 fibjs 进程不退出，在定时器等待期间阻止 fibjs 进程退出
    * @return 返回定时器对象
    * 
    * 
    * 
    */
  def ref(): ClassTimer = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询当前定时器是否已经终止
    * 
    * @readonly
    * @type Boolean
    */
  var stopped: Boolean = js.native
  
  /**
    * 
    * @brief 允许 fibjs 进程退出，在定时器等待期间允许 fibjs 进程退出
    * @return 返回定时器对象
    * 
    * 
    * 
    */
  def unref(): ClassTimer = js.native
}
