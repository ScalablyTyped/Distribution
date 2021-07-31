package typings.fibjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件的基础信息对象
  * @detail Stat 对象通过 fs.stat, File.stat, fs.readdir 查询，不可独立创建
  */
@js.native
trait ClassStat
  extends StObject
     with ClassObject {
  
  /**
    * class prop 
    *
    * 
    * @brief 文件最后访问时间
    * 
    * @readonly
    * @type Date
    */
  var atime: Date = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件创建时间
    * 
    * @readonly
    * @type Date
    */
  var ctime: Date = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件所属的组id
    * 
    * @readonly
    * @type Integer
    */
  var gid: Double = js.native
  
  /**
    * 
    * @brief 查询文件是否是目录
    * @return 为 true 则是目录
    * 
    * 
    * 
    */
  def isDirectory(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否有执行权限
    * @return 为 true 则有执行权限
    * 
    * 
    * 
    */
  def isExecutable(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否是文件
    * @return 为 true 则是文件
    * 
    * 
    * 
    */
  def isFile(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否隐藏
    * @return 为 true 则隐藏
    * 
    * 
    * 
    */
  def isHidden(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否是内存文件
    * @return 为 true 则是内存文件
    * 
    * 
    * 
    */
  def isMemory(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否有读权限
    * @return 为 true 则有读权限
    * 
    * 
    * 
    */
  def isReadable(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否是 Socket
    * @return 为 true 则是 Socket
    * 
    * 
    * 
    */
  def isSocket(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否是符号链接
    * @return 为 true 则是符号链接
    * 
    * 
    * 
    */
  def isSymbolicLink(): Boolean = js.native
  
  /**
    * 
    * @brief 查询文件是否有写入权限
    * @return 为 true 则有写入权限
    * 
    * 
    * 
    */
  def isWritable(): Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件权限，Windows 不支持此属性
    * 
    * @readonly
    * @type Integer
    */
  var mode: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件最后修改时间
    * 
    * @readonly
    * @type Date
    */
  var mtime: Date = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件名称
    * 
    * @readonly
    * @type String
    */
  var name: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件尺寸
    * 
    * @readonly
    * @type Long
    */
  var size: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 文件拥有者的id
    * 
    * @readonly
    * @type Integer
    */
  var uid: Double = js.native
}
