package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief mongodb 数据库数据集对象
  * @detail 使用 MongoDB.getCollection 创建：,```JavaScript,var col1 = mdb.getCollection('test');,var col = mdb.test;,```
  */
@js.native
trait ClassMongoCollection extends ClassObject {
  
  /**
    * 
    * @brief 删除当前集合
    * 
    * 
    */
  def drop(): Unit = js.native
  
  /**
    * 
    * @brief 删除当前集合指定名称的索引
    * @param name 给定要删除的索引名称
    * @return 返回命令执行结果
    * 
    * 
    * 
    */
  def dropIndex(name: String): js.Object = js.native
  
  /**
    * 
    * @brief 删除当前集合全部索引
    * @return 返回命令执行结果
    * 
    * 
    * 
    */
  def dropIndexes(): js.Object = js.native
  
  /**
    * 
    * @brief 在当前集合上创建索引
    * @param keys 给定索引字段、顺序和方向
    * @param options 给定索引的选项，唯一索引等
    * 
    * 
    * 
    */
  def ensureIndex(keys: js.Object): Unit = js.native
  def ensureIndex(keys: js.Object, options: js.Object): Unit = js.native
  
  /**
    * 
    * @brief 根据给定的查询条件和返回字段设定，建立游标对象
    * @param query 指定查询条件的对象
    * @param projection 指定返回字段的对象
    * @return 返回游标对象
    * 
    * 
    * 
    */
  def find(): ClassMongoCursor = js.native
  def find(query: js.UndefOr[scala.Nothing], projection: js.Object): ClassMongoCursor = js.native
  def find(query: js.Object): ClassMongoCursor = js.native
  def find(query: js.Object, projection: js.Object): ClassMongoCursor = js.native
  
  /**
    * 
    * @brief 查询并修改
    * @param query 指定查询条件，修改数据
    * @return 返回修改前的结果及其他信息
    * 
    * 
    * 
    */
  def findAndModify(query: js.Object): js.Object = js.native
  
  /**
    * 
    * @brief 根据给定的查询条件和返回字段设定，查询一条结果
    * @param query 指定查询条件的对象
    * @param projection 指定返回字段的对象
    * @return 返回第一条结果
    * 
    * 
    * 
    */
  def findOne(): js.Object = js.native
  def findOne(query: js.UndefOr[scala.Nothing], projection: js.Object): js.Object = js.native
  def findOne(query: js.Object): js.Object = js.native
  def findOne(query: js.Object, projection: js.Object): js.Object = js.native
  
  /**
    * 
    * @brief 获取当前集合子命名空间的集合对象
    * @param name 子命名空间名称
    * @return 返回新集合对象
    * 
    * 
    * 
    */
  def getCollection(name: String): ClassMongoCollection = js.native
  
  /**
    * 
    * @brief 查询当前集合全部索引
    * @return 返回包含索引的结果集
    * 
    * 
    * 
    */
  def getIndexes(): ClassMongoCursor = js.native
  
  /**
    * 
    * @brief 插入一条数据
    * @param document 指定要插入的数据
    * 
    * 
    * 
    */
  def insert(document: js.Object): Unit = js.native
  /**
    * 
    * @brief 插入一组数据
    * @param documents 指定要插入的数据数组
    * 
    * 
    * 
    */
  def insert(documents: js.Array[_]): Unit = js.native
  
  /**
    * 
    * @brief 重建当前集合的索引
    * @return 返回命令执行结果
    * 
    * 
    * 
    */
  def reIndex(): js.Object = js.native
  
  /**
    * 
    * @brief 根据给定的查询条件删除数据
    * @param query 指定查询条件的对象
    * 
    * 
    * 
    */
  def remove(query: js.Object): Unit = js.native
  
  /**
    * 
    * @brief 执行数据库命令
    * @param cmd 给定命令名称
    * @param arg 给定命令参数选项
    * @return 返回命令返回结果
    * 
    * 
    * 
    */
  def runCommand(cmd: String): js.Object = js.native
  def runCommand(cmd: String, arg: js.Object): js.Object = js.native
  /**
    * 
    * @brief 执行数据库命令
    * @param cmd 给定命令对象
    * @return 返回命令返回结果
    * 
    * 
    * 
    */
  def runCommand(cmd: js.Object): js.Object = js.native
  
  /**
    * 
    * @brief 保存一条数据，若数据包含 _id 字段，则为更新，否则为插入
    * @param document 指定要保存的数据
    * 
    * 
    * 
    */
  def save(document: js.Object): Unit = js.native
  
  /**
    * 
    * @brief 根据给定的查询条件更新数据
    * @param query 指定查询条件的对象
    * @param document 指定要更新的数据
    * @param upsert 数据不存在时，插入一条新数据，缺省为 false，不插入
    * @param multi 当符合条件的数据多于一条时，更新所有数据，缺省为 false，只更新第一条
    * 
    * 
    * 
    */
  def update(query: js.Object, document: js.Object): Unit = js.native
  /**
    * 
    * @brief 根据给定的查询条件更新数据
    * @param query 指定查询条件的对象
    * @param document 指定要更新的数据
    * @param options 以对象字段传递的 upsert 和 multi 选项
    * 
    * 
    * 
    */
  def update(query: js.Object, document: js.Object, options: js.Object): Unit = js.native
  def update(query: js.Object, document: js.Object, upsert: js.UndefOr[scala.Nothing], multi: Boolean): Unit = js.native
  def update(query: js.Object, document: js.Object, upsert: Boolean): Unit = js.native
  def update(query: js.Object, document: js.Object, upsert: Boolean, multi: Boolean): Unit = js.native
}
