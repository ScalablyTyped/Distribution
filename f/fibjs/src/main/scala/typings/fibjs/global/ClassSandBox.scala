package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 安全沙箱对象，用于管理一个独立的运行空间
  * @detail  所有的代码都运行在自己的沙箱中，全局的 require 会调用当前沙箱加载模块，沙箱会通过 require 传递给加载的沙箱。下面的示例创建一个沙箱，限制只允许访问全局基础模块中的 assert 模块，并添加 a 和 b 两个定制模块：,```JavaScript,var vm = require('vm');,var sbox = new vm.SandBox({,  a: 100,,  b: 200,,  assert: require('assert'),});,,var mod_in_sbox = sbox.require('./path/to/mod');,```
  */
@JSGlobal("Class_SandBox")
@js.native
class ClassSandBox protected ()
  extends typings.fibjs.ClassSandBox {
  /**
    * 
    * @brief 构造一个新的安全沙箱对象，并初始化基础模块
    * @param mods 指定要添加的模块对象字典
    * 
    * 
    * 
    */
  def this(mods: js.Object) = this()
  /**
    * 
    * @brief 构造一个独立 Global 新的安全沙箱对象，并初始化基础模块
    * @param mods 指定要添加的模块对象字典
    * @param global 指定初始化的 Global 属性
    * 
    * 
    * 
    */
  def this(mods: js.Object, global: js.Object) = this()
  /**
    * 
    * @brief 构造一个新的安全沙箱对象，并初始化基础模块
    * @param mods 指定要添加的模块对象字典
    * @param require 自定义 require 函数，当模块不存在时，先调用自定义函数，无返回再从文件中加载
    * 
    * 
    * 
    */
  def this(mods: js.Object, require: js.Function) = this()
  /**
    * 
    * @brief 构造一个独立 Global 新的安全沙箱对象，并初始化基础模块
    * @param mods 指定要添加的模块对象字典
    * @param require 自定义 require 函数，当模块不存在时，先调用自定义函数，无返回再从文件中加载
    * @param global 指定初始化的 Global 属性
    * 
    * 
    * 
    */
  def this(mods: js.Object, require: js.Function, global: js.Object) = this()
}
