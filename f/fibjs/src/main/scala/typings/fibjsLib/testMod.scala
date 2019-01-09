package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 测试套件模块，用以定义管理测试套件
	* @detail 使用方法 ：,,```JavaScript,var test = require('test');,test.setup();,,describe('test', () => {,  before(() => {,      // setup before the whole test,  });,,  beforeEach(() => {,      // setup before each test,  });,,  after(() => {,      // cleanup after the whole test,  });,,  afterEach(() => {,      // cleanup after each test,  });,,  it('case', () => {,      assert.ok(true);,  });,,  // ignored test case,  xit('case', () => {,      assert.ok(true);,  });,,  // ignored test case,  it.skip('case', () => {,      assert.ok(true);,  });,,  // only test case,  oit('case', () => {,      assert.ok(true);,  });,,  // only test case,  it.only('case', () => {,      assert.ok(true);,  });,});,,// async function test,describe('test async', () => {,it('pass case', async() => {,  assert.ok(true);,});,,it('error case', async() => {,    throw new Error('some thing wrong!');,});,});,,// callback function test,// cannot use callback mode in jsc,describe('test callback', () => {,it('pass case', done => {,  setTimeout(() => {,    assert.ok(true);,    done();,  }, 0);,});,,it('error case', done => {,  setTimeout(() => {,    done(new Error('some thing wrong!'));,  }, 0);,});,});,,process.exit(-test.run(console.DEBUG));,```
	*/
@JSImport("test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  val assert: fibjsLib.Anon_Actual = js.native
  val slow: scala.Double = js.native
  def after(func: js.Function): scala.Unit = js.native
  def afterEach(func: js.Function): scala.Unit = js.native
  def before(func: js.Function): scala.Unit = js.native
  def beforeEach(func: js.Function): scala.Unit = js.native
  def describe(name: java.lang.String, block: js.Function): scala.Unit = js.native
  def it(name: java.lang.String, block: js.Function): scala.Unit = js.native
  def odescribe(name: java.lang.String, block: js.Function): scala.Unit = js.native
  def oit(name: java.lang.String, block: js.Function): scala.Unit = js.native
  def run(): scala.Double = js.native
  def run(loglevel: scala.Double): scala.Double = js.native
  def setup(): scala.Unit = js.native
  def xdescribe(name: java.lang.String, block: js.Function): scala.Unit = js.native
  def xit(name: java.lang.String, block: js.Function): scala.Unit = js.native
}

