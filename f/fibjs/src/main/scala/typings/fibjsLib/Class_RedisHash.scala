package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief Redis 数据库客户端 Hash 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
	* @detail 用以操作 Redis 的 Hash 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var hash = rdb.getHash("test");,```
	*/
@JSGlobal("Class_RedisHash")
@js.native
class Class_RedisHash () extends Class__object {
  /**
  	 * 
  	 * @brief 删除哈希表中的一个或多个指定域，不存在的域将被忽略
  	 * @param fields 指定要删除的域列表
  	 * @return 被删除域的数量
  	 * 
  	 * 
  	 */
  def del(fields: js.Any*): scala.Double = js.native
  /**
  	 * 
  	 * @brief 删除哈希表中的一个或多个指定域，不存在的域将被忽略
  	 * @param fields 指定要删除的域数组
  	 * @return 被删除域的数量
  	 * 
  	 * 
  	 */
  def del(fields: js.Array[_]): scala.Double = js.native
  /**
  	 * 
  	 * @brief 查看哈希表中，给定域 field 是否存在
  	 * @param field 指定要查询的 field
  	 * @return 如果哈希表含有给定域，返回 true，如果哈希表不含有给定域，或 key 不存在，返回 false
  	 * 
  	 * 
  	 */
  def exists(field: Class_Buffer): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中给定域 field 的值
  	 * @param field 指定要查询的 field
  	 * @return 给定域的值，当给定域不存在或是给定 key 不存在时，返回 null
  	 * 
  	 * 
  	 */
  def get(field: Class_Buffer): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中，所有的域和值
  	 * @return 返回一个包含哈希表中所有域的列表
  	 * 
  	 * 
  	 */
  def getAll(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 将域所储存的值加上增量
  	 * @param field 指定要修改的域
  	 * @param num 指定要加上的数值
  	 * @return 加上 num 之后，域的值
  	 * 
  	 * 
  	 */
  def incr(field: Class_Buffer): scala.Double = js.native
  def incr(field: Class_Buffer, num: scala.Double): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中的所有域
  	 * @return 返回值里，紧跟每个域名(field name)之后是域的值(value)，所以返回值的长度是哈希表大小的两倍
  	 * 
  	 * 
  	 */
  def keys(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中域的数量
  	 * @return 返回哈希表中域的数量
  	 * 
  	 * 
  	 */
  def len(): scala.Double = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中，一个或多个给定域的值
  	 * @param fields 指定要查询的域列表
  	 * @return 一个包含所有给定域的值的列表
  	 * 
  	 * 
  	 */
  def mget(fields: js.Any*): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 返回哈希表中，一个或多个给定域的值
  	 * @param fields 指定要查询的域数组
  	 * @return 一个包含所有给定域的值的列表
  	 * 
  	 * 
  	 */
  def mget(fields: js.Array[_]): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 同时将多个 field-value (域-值)对设置到哈希表中，此命令会覆盖哈希表中已存在的域
  	 * @param kvs 指定要设置的 field/value 列表
  	 * 
  	 * 
  	 */
  def mset(kvs: js.Any*): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 同时将多个 field-value (域-值)对设置到哈希表中，此命令会覆盖哈希表中已存在的域
  	 * @param kvs 指定要设置的 field/value 对象
  	 * 
  	 * 
  	 */
  def mset(kvs: js.Object): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 将哈希表中的域 field 的值设为 value，如果域 field 已经存在于哈希表中，旧值将被覆盖
  	 * @param field 指定要修改的 field
  	 * @param value 指定要修改的数据
  	 * 
  	 * 
  	 */
  def set(field: Class_Buffer, value: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 将哈希表中的域 field 的值设置为 value ，当且仅当域 field 不存在。若域 field 已经存在，该操作无效
  	 * @param field 指定要修改的 field
  	 * @param value 指定要修改的数据
  	 * 
  	 * 
  	 */
  def setNX(field: Class_Buffer, value: Class_Buffer): scala.Unit = js.native
}

