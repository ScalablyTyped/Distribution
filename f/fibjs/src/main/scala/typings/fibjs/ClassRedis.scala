package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端对象
  * @detail 用以创建和管理 Redis 数据库，创建方法：,```JavaScript,var db = require("db");,var test = new db.openRedis("redis-server");,```
  */
@js.native
trait ClassRedis extends ClassObject {
  
  /**
    * 
    * @brief 如果 key 已经存在并且是一个字符串，append 命令将 value 追加到 key 原来的值的末尾。如果 key 不存在，append 就简单地将给定 key 设为 value
    * @param key 指定要追加的 key
    * @param value 指定要追加的数据
    * @return 追加 value 之后， key 中字符串的长度
    * 
    * 
    */
  def append(key: ClassBuffer, value: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 计算给定字符串中，被设置为 1 的比特位的数量
    * @param key 指定要计算的 key
    * @param start 指定要计算的起始字节，可以使用负数值，-1 表示最后一个字节，而 -2 表示倒数第二个字节，以此类推
    * @param end 指定要计算的结束字节，可以使用负数值，-1 表示最后一个字节，而 -2 表示倒数第二个字节，以此类推
    * @return 被设置为 1 的位的数量
    * 
    * 
    */
  def bitcount(key: ClassBuffer): Double = js.native
  def bitcount(key: ClassBuffer, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def bitcount(key: ClassBuffer, start: Double): Double = js.native
  def bitcount(key: ClassBuffer, start: Double, end: Double): Double = js.native
  
  /**
    * 
    * @brief 关闭当前数据库连接或事务
    * 
    * 
    */
  def close(): Unit = js.native
  
  /**
    * 
    * @brief redis 基础命令方法
    * @param cmd 指定发送的命令
    * @param args 指定发送的参数
    * @return 返回服务器返回的结果
    * 
    * 
    */
  def command(cmd: String, args: js.Any*): js.Any = js.native
  
  /**
    * 
    * @brief 将 key 所储存的值减去减量
    * @param key 指定要修改的 key
    * @param num 指定要减去的数值
    * @return 减去 num 之后，key 的值
    * 
    * 
    */
  def decr(key: ClassBuffer): Double = js.native
  def decr(key: ClassBuffer, num: Double): Double = js.native
  
  /**
    * 
    * @brief 删除给定的一个或多个 key，不存在的 key 会被忽略
    * @param keys 指定要删除的 key 列表
    * @return 被删除 key 的数量
    * 
    * 
    */
  def del(keys: js.Any*): Double = js.native
  /**
    * 
    * @brief 删除给定的一个或多个 key，不存在的 key 会被忽略
    * @param keys 指定要删除的 key 数组
    * @return 被删除 key 的数量
    * 
    * 
    */
  def del(keys: js.Array[_]): Double = js.native
  
  /**
    * 
    * @brief 序列化给定 key ，并返回被序列化的值，使用 restore 命令可以将这个值反序列化为 Redis 键
    * @param key 指定要序列化的 key
    * @return 返回序列化之后的值，如果 key 不存在，那么返回 null
    * 
    * 
    */
  def dump(key: ClassBuffer): ClassBuffer = js.native
  
  /**
    * 
    * @brief 检查给定 key 是否存在
    * @param key 指定要关联的 key
    * @return 若 key 存在，返回 True，否则返回 False
    * 
    * 
    */
  def exists(key: ClassBuffer): Boolean = js.native
  
  /**
    * 
    * @brief 为给定 key 设置生存时间，当 key 过期时，它会被自动删除
    * @param key 指定要设定的 key
    * @param ttl 以毫秒为单位为 key 设置生存时间
    * @return 若 key 存在，返回 True，否则返回 False
    * 
    * 
    */
  def expire(key: ClassBuffer, ttl: Double): Boolean = js.native
  
  /**
    * 
    * @brief 返回 key 所关联的字符串值，如果 key 不存在那么返回特殊值 Null
    * @param key 指定要关联的 key
    * @return 当 key 不存在时，返回 Null ，否则，返回 key 的值
    * 
    * 
    */
  def get(key: ClassBuffer): ClassBuffer = js.native
  
  /**
    * 
    * @brief 对 key 所储存的字符串值，获取指定偏移量上的位(bit)
    * @param key 指定要查询的 key
    * @param offset 指定查询的位偏移
    * @return 字符串值指定偏移量上的位(bit)
    * 
    * 
    */
  def getBit(key: ClassBuffer, offset: Double): Double = js.native
  
  /**
    * 
    * @brief 获取指定 key 的 Hash 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
    * @param key 指定要获取的 key
    * @return 返回包含指定 key 的 Hash 对象
    * 
    * 
    */
  def getHash(key: ClassBuffer): ClassRedisHash = js.native
  
  /**
    * 
    * @brief 获取指定 key 的 List 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
    * @param key 指定要获取的 key
    * @return 返回包含指定 key 的 List 对象
    * 
    * 
    */
  def getList(key: ClassBuffer): ClassRedisList = js.native
  
  /**
    * 
    * @brief 返回 key 中字符串值的子字符串，字符串的截取范围由 start 和 end 两个偏移量决定(包括 start 和 end 在内)
    * @param key 指定要查询的 key
    * @param start 指定查询的起始字节偏移
    * @param end 指定查询的结束字节偏移
    * @return 截取得出的子字符串
    * 
    * 
    */
  def getRange(key: ClassBuffer, start: Double, end: Double): ClassBuffer = js.native
  
  /**
    * 
    * @brief 获取指定 key 的 Set 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
    * @param key 指定要获取的 key
    * @return 返回包含指定 key 的 Set 对象
    * 
    * 
    */
  def getSet(key: ClassBuffer): ClassRedisSet = js.native
  
  /**
    * 
    * @brief 获取指定 key 的 SortedSet 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
    * @param key 指定要获取的 key
    * @return 返回包含指定 key 的 SortedSet 对象
    * 
    * 
    */
  def getSortedSet(key: ClassBuffer): ClassRedisSortedSet = js.native
  
  /**
    * 
    * @brief 将给定 key 的值设为 value ，并返回 key 的旧值(old value)
    * @param key 指定要查询修改的 key
    * @param value 指定修改的数值
    * @return 返回给定 key 的旧值
    * 
    * 
    */
  def getset(key: ClassBuffer, value: ClassBuffer): ClassBuffer = js.native
  
  /**
    * 
    * @brief 将 key 所储存的值加上增量
    * @param key 指定要修改的 key
    * @param num 指定要加上的数值
    * @return 加上 num 之后，key 的值
    * 
    * 
    */
  def incr(key: ClassBuffer): Double = js.native
  def incr(key: ClassBuffer, num: Double): Double = js.native
  
  /**
    * 
    * @brief 查找所有符合给定模式 pattern 的 key
    * @param pattern 指定查询模式
    * @return 符合给定模式的 key 列表
    * 
    * 
    */
  def keys(pattern: String): js.Array[_] = js.native
  
  /**
    * 
    * @brief 返回所有(一个或多个)给定 key 的值。如果给定的 key 里面，有某个 key 不存在，那么这个 key 返回特殊值 nil 。
    * @param keys 指定要查询的 key 列表
    * @return 一个包含所有给定 key 的值的列表
    * 
    * 
    */
  def mget(keys: js.Any*): js.Array[_] = js.native
  /**
    * 
    * @brief 返回所有(一个或多个)给定 key 的值。如果给定的 key 里面，有某个 key 不存在，那么这个 key 返回特殊值 nil 。
    * @param keys 指定要查询的 key 数组
    * @return 一个包含所有给定 key 的值的列表
    * 
    * 
    */
  def mget(keys: js.Array[_]): js.Array[_] = js.native
  
  /**
    * 
    * @brief 同时设置一个或多个 key-value 对。如果某个给定 key 已经存在，那么 MSET 会用新值覆盖原来的旧值
    * @param kvs 指定要设置的 key/value 列表
    * 
    * 
    */
  def mset(kvs: js.Any*): Unit = js.native
  /**
    * 
    * @brief 同时设置一个或多个 key-value 对。如果某个给定 key 已经存在，那么 MSET 会用新值覆盖原来的旧值
    * @param kvs 指定要设置的 key/value 对象
    * 
    * 
    */
  def mset(kvs: js.Object): Unit = js.native
  
  /**
    * 
    * @brief 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在
    * @param kvs 指定要设置的 key/value 列表
    * 
    * 
    */
  def msetNX(kvs: js.Any*): Unit = js.native
  /**
    * 
    * @brief 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在
    * @param kvs 指定要设置的 key/value 对象
    * 
    * 
    */
  def msetNX(kvs: js.Object): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置错误处理函数，当 sub 出现错误或者网络中断时回调，当回调发生后，本对象的一切 sub 都将中止
    * 
    * 
    * 
    * @type Function
    */
  var onsuberror: js.Function = js.native
  
  /**
    * 
    * @brief 移除给定 key 的生存时间，将这个 key 从『易失的』(带生存时间 key )转换成『持久的』(一个不带生存时间、永不过期的 key)
    * @param key 指定要设定的 key
    * @return 若 key 存在，返回 True，否则返回 False
    * 
    * 
    */
  def persist(key: ClassBuffer): Boolean = js.native
  
  /**
    * 
    * @brief 订阅给定的一组频道模板的信息，当消息发生时自动调用相应的 func，同一频道同一函数只会回调一次
    * @param map 指定频道映射关系，对象属性名称将作为频道模板，属性的值将作为回调函数
    * 
    * 
    * 
    */
  def psub(map: js.Object): Unit = js.native
  /**
    * 
    * @brief 按照模板订阅一组频道的信息，当消息发生时自动调用 func，func 包含三个参数，依次为 channel，message 和 pattern，同一模板同一函数只会回调一次
    * @param pattern 指定订阅的频道模板
    * @param func 指定回调函数
    * 
    * 
    * 
    */
  def psub(pattern: String, func: js.Function): Unit = js.native
  
  /**
    * 
    * @brief 将信息 message 发送到指定的频道 channel
    * @param channel 指定发布的频道
    * @param message 指定发布的消息
    * @return 接收此消息的客户端数量
    * 
    * 
    * 
    */
  def pub(channel: ClassBuffer, message: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 将 key 改名为 newkey，当 key 和 newkey 相同，或者 key 不存在时，返回一个错误
    * @param key 指定要改名的 key
    * @param newkey 指定要改名的目的 key
    * 
    * 
    */
  def rename(key: ClassBuffer, newkey: ClassBuffer): Unit = js.native
  
  /**
    * 
    * @brief 当且仅当 newkey 不存在时，将 key 改名为 newkey，当 key 不存在时，返回一个错误
    * @param key 指定要改名的 key
    * @param newkey 指定要改名的目的 key
    * @return 修改成功时，返回 True，如果 newkey 已经存在，返回 False
    * 
    * 
    */
  def renameNX(key: ClassBuffer, newkey: ClassBuffer): Boolean = js.native
  
  /**
    * 
    * @brief 反序列化给定的序列化值，并将它和给定的 key 关联
    * @param key 指定要反序列化的 key
    * @param data 指定要反序列化的数据
    * @param ttl 以毫秒为单位为 key 设置生存时间；如果 ttl 为 0 ，那么不设置生存时间
    * 
    * 
    */
  def restore(key: ClassBuffer, data: ClassBuffer): Unit = js.native
  def restore(key: ClassBuffer, data: ClassBuffer, ttl: Double): Unit = js.native
  
  /**
    * 
    * @brief 将字符串值 value 关联到 key，如果 key 已经持有其他值， SET 就覆写旧值，无视类型
    * @param key 指定要关联的 key
    * @param value 指定要关联的数据
    * @param ttl 以毫秒为单位为 key 设置生存时间；如果 ttl 为 0 ，那么不设置生存时间
    * 
    * 
    */
  def set(key: ClassBuffer, value: ClassBuffer): Unit = js.native
  def set(key: ClassBuffer, value: ClassBuffer, ttl: Double): Unit = js.native
  
  /**
    * 
    * @brief 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)
    * @param key 指定要修改的 key
    * @param offset 指定修改的位偏移
    * @param value 指定设置或清除的参数，可以是 0 也可以是 1
    * @return 指定偏移量原来储存的位
    * 
    * 
    */
  def setBit(key: ClassBuffer, offset: Double, value: Double): Double = js.native
  
  /**
    * 
    * @brief 将 key 的值设为 value ，当且仅当 key 不存在。若给定的 key 已经存在，则 SETNX 不做任何动作。
    * @param key 指定要关联的 key
    * @param value 指定要关联的数据
    * @param ttl 以毫秒为单位为 key 设置生存时间；如果 ttl 为 0 ，那么不设置生存时间
    * 
    * 
    */
  def setNX(key: ClassBuffer, value: ClassBuffer): Unit = js.native
  def setNX(key: ClassBuffer, value: ClassBuffer, ttl: Double): Unit = js.native
  
  /**
    * 
    * @brief 用 value 参数覆写给定 key 所储存的字符串值，从偏移量 offset 开始
    * @param key 指定要修改的 key
    * @param offset 指定修改的字节偏移
    * @param value 指定要覆盖的数据
    * @return 被修改之后，字符串的长度
    * 
    * 
    */
  def setRange(key: ClassBuffer, offset: Double, value: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 将 key 的值设为 value，只在键已经存在时，才对键进行设置操作。
    * @param key 指定要关联的 key
    * @param value 指定要关联的数据
    * @param ttl 以毫秒为单位为 key 设置生存时间；如果 ttl 为 0 ，那么不设置生存时间
    * 
    * 
    */
  def setXX(key: ClassBuffer, value: ClassBuffer): Unit = js.native
  def setXX(key: ClassBuffer, value: ClassBuffer, ttl: Double): Unit = js.native
  
  /**
    * 
    * @brief 返回 key 所储存的字符串值的长度。当 key 储存的不是字符串值时，返回一个错误
    * @param key 指定要计算的 key
    * @return 字符串值的长度。当 key 不存在时，返回 0
    * 
    * 
    */
  def strlen(key: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 订阅给定的一个频道的信息，当消息发生时自动调用 func，func 包含两个参数，依次为 channel 和 message，同一频道同一函数只会回调一次
    * @param channel 指定订阅的频道名称
    * @param func 指定回调函数
    * 
    * 
    * 
    */
  def sub(channel: ClassBuffer, func: js.Function): Unit = js.native
  /**
    * 
    * @brief 订阅给定的一组频道的信息，当消息发生时自动调用相应的回调函数，同一频道同一函数只会回调一次
    * @param map 指定频道映射关系，对象属性名称将作为频道名称，属性的值将作为回调函数
    * 
    * 
    * 
    */
  def sub(map: js.Object): Unit = js.native
  
  /**
    * 
    * @brief 返回给定 key 的剩余生存时间
    * @param key 指定要查询的 key
    * @return 以毫秒为单位，返回 key 的剩余生存时间，当 key 不存在时，返回 -2，当 key 存在但没有设置剩余生存时间时，返回 -1
    * 
    * 
    */
  def ttl(key: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 返回 key 所储存的值的类型
    * @param key 指定要查询的 key
    * @return 返回 key 所储存的值的类型，可能的值为 none(key不存在) string(字符串) list(列表) set(集合) zset(有序集) hash(哈希表)
    * 
    * 
    */
  def `type`(key: ClassBuffer): String = js.native
  
  /**
    * 
    * @brief 退订一组模板的频道的指定回调函数
    * @param map 指定频道映射关系，对象属性名称将作为频道模板，属性的值将作为回调函数
    * 
    * 
    * 
    */
  def unpsub(map: js.Object): Unit = js.native
  /**
    * 
    * @brief 退订给定模板的频道的全部回调
    * @param pattern 指定退订的频道模板
    * 
    * 
    * 
    */
  def unpsub(pattern: String): Unit = js.native
  /**
    * 
    * @brief 退订给定模板的频道的指定回调函数
    * @param pattern 指定退订的频道模板
    * @param func 指定退订的回调函数
    * 
    * 
    * 
    */
  def unpsub(pattern: String, func: js.Function): Unit = js.native
  /**
    * 
    * @brief 退订一组给定模板的频道的全部回调
    * @param patterns 指定发布的频道模板数组
    * 
    * 
    * 
    */
  def unpsub(patterns: js.Array[_]): Unit = js.native
  
  /**
    * 
    * @brief 退订一组给定的频道的全部回调
    * @param channels 指定退订的频道数组
    * 
    * 
    * 
    */
  def unsub(channels: js.Array[_]): Unit = js.native
  /**
    * 
    * @brief 退订给定的频道的全部回调
    * @param channel 指定退订的频道名称
    * 
    * 
    * 
    */
  def unsub(channel: ClassBuffer): Unit = js.native
  /**
    * 
    * @brief 退订给定的频道的指定回调函数
    * @param channel 指定退订的频道名称
    * @param func 指定退订的回调函数
    * 
    * 
    * 
    */
  def unsub(channel: ClassBuffer, func: js.Function): Unit = js.native
  /**
    * 
    * @brief 退订给定的一组频道的指定回调函数
    * @param map 指定频道映射关系，对象属性名称将作为频道名称，属性的值将作为回调函数
    * 
    * 
    * 
    */
  def unsub(map: js.Object): Unit = js.native
}
