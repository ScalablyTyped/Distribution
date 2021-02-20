package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 测试套件模块，用以定义管理测试套件
  * @detail 使用方法 ：,,```JavaScript,var test = require('test');,test.setup();,,describe('test', () => {,  before(() => {,      // setup before the whole test,  });,,  beforeEach(() => {,      // setup before each test,  });,,  after(() => {,      // cleanup after the whole test,  });,,  afterEach(() => {,      // cleanup after each test,  });,,  it('case', () => {,      assert.ok(true);,  });,,  // ignored test case,  xit('case', () => {,      assert.ok(true);,  });,,  // ignored test case,  it.skip('case', () => {,      assert.ok(true);,  });,,  // only test case,  oit('case', () => {,      assert.ok(true);,  });,,  // only test case,  it.only('case', () => {,      assert.ok(true);,  });,});,,// async function test,describe('test async', () => {,it('pass case', async() => {,  assert.ok(true);,});,,it('error case', async() => {,    throw new Error('some thing wrong!');,});,});,,// callback function test,// cannot use callback mode in jsc,describe('test callback', () => {,it('pass case', done => {,  setTimeout(() => {,    assert.ok(true);,    done();,  }, 0);,});,,it('error case', done => {,  setTimeout(() => {,    done(new Error('some thing wrong!'));,  }, 0);,});,});,,process.exit(-test.run(console.DEBUG));,```
  */
object testMod {
  
  @JSImport("test", "after")
  @js.native
  def after(func: js.Function): Unit = js.native
  
  @JSImport("test", "afterEach")
  @js.native
  def afterEach(func: js.Function): Unit = js.native
  
  object assert {
    
    @JSImport("test", "assert.Function")
    @js.native
    def Function(): Unit = js.native
    @JSImport("test", "assert.Function")
    @js.native
    def Function(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.Function")
    @js.native
    def Function(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.Function")
    @js.native
    def Function(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.closeTo")
    @js.native
    def closeTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
    @JSImport("test", "assert.closeTo")
    @js.native
    def closeTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.deepEqual")
    @js.native
    def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.deepProperty")
    @js.native
    def deepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
    @JSImport("test", "assert.deepProperty")
    @js.native
    def deepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.deepPropertyNotVal")
    @js.native
    def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
    @JSImport("test", "assert.deepPropertyNotVal")
    @js.native
    def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.deepPropertyVal")
    @js.native
    def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
    @JSImport("test", "assert.deepPropertyVal")
    @js.native
    def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function): Unit = js.native
    @JSImport("test", "assert.doesNotThrow")
    @js.native
    def doesNotThrow(block: js.Function, msg: String): Unit = js.native
    
    @JSImport("test", "assert.equal")
    @js.native
    def equal(): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.equal")
    @js.native
    def equal(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.exist")
    @js.native
    def exist(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.exist")
    @js.native
    def exist(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.greaterThan")
    @js.native
    def greaterThan(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.greaterThan")
    @js.native
    def greaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.ifError")
    @js.native
    def ifError(): Unit = js.native
    @JSImport("test", "assert.ifError")
    @js.native
    def ifError(`object`: js.Any): Unit = js.native
    
    @JSImport("test", "assert.isArray")
    @js.native
    def isArray(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isArray")
    @js.native
    def isArray(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isBoolean")
    @js.native
    def isBoolean(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isBoolean")
    @js.native
    def isBoolean(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isDefined")
    @js.native
    def isDefined(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isDefined")
    @js.native
    def isDefined(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isFalse")
    @js.native
    def isFalse(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isFalse")
    @js.native
    def isFalse(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isFunction")
    @js.native
    def isFunction(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isFunction")
    @js.native
    def isFunction(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotArray")
    @js.native
    def isNotArray(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotArray")
    @js.native
    def isNotArray(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotBoolean")
    @js.native
    def isNotBoolean(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotBoolean")
    @js.native
    def isNotBoolean(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotFalse")
    @js.native
    def isNotFalse(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotFalse")
    @js.native
    def isNotFalse(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotFunction")
    @js.native
    def isNotFunction(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotFunction")
    @js.native
    def isNotFunction(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotNull")
    @js.native
    def isNotNull(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotNull")
    @js.native
    def isNotNull(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotNumber")
    @js.native
    def isNotNumber(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotNumber")
    @js.native
    def isNotNumber(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotObject")
    @js.native
    def isNotObject(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotObject")
    @js.native
    def isNotObject(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotString")
    @js.native
    def isNotString(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotString")
    @js.native
    def isNotString(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNotTrue")
    @js.native
    def isNotTrue(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNotTrue")
    @js.native
    def isNotTrue(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNull")
    @js.native
    def isNull(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNull")
    @js.native
    def isNull(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isNumber")
    @js.native
    def isNumber(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isNumber")
    @js.native
    def isNumber(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isObject")
    @js.native
    def isObject(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isObject")
    @js.native
    def isObject(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isString")
    @js.native
    def isString(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isString")
    @js.native
    def isString(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isTrue")
    @js.native
    def isTrue(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isTrue")
    @js.native
    def isTrue(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.isUndefined")
    @js.native
    def isUndefined(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.isUndefined")
    @js.native
    def isUndefined(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.lessThan")
    @js.native
    def lessThan(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.lessThan")
    @js.native
    def lessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notCloseTo")
    @js.native
    def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
    @JSImport("test", "assert.notCloseTo")
    @js.native
    def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notDeepEqual")
    @js.native
    def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notDeepProperty")
    @js.native
    def notDeepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
    @JSImport("test", "assert.notDeepProperty")
    @js.native
    def notDeepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notEqual")
    @js.native
    def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notExist")
    @js.native
    def notExist(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.notExist")
    @js.native
    def notExist(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notGreaterThan")
    @js.native
    def notGreaterThan(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notGreaterThan")
    @js.native
    def notGreaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notLessThan")
    @js.native
    def notLessThan(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notLessThan")
    @js.native
    def notLessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notOk")
    @js.native
    def notOk(): Unit = js.native
    @JSImport("test", "assert.notOk")
    @js.native
    def notOk(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notOk")
    @js.native
    def notOk(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.notOk")
    @js.native
    def notOk(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notProperty")
    @js.native
    def notProperty(`object`: js.Any, prop: js.Any): Unit = js.native
    @JSImport("test", "assert.notProperty")
    @js.native
    def notProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.notStrictEqual")
    @js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.notTypeOf")
    @js.native
    def notTypeOf(actual: js.Any, `type`: String): Unit = js.native
    @JSImport("test", "assert.notTypeOf")
    @js.native
    def notTypeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
    
    @JSImport("test", "assert.ok")
    @js.native
    def ok(): Unit = js.native
    @JSImport("test", "assert.ok")
    @js.native
    def ok(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.ok")
    @js.native
    def ok(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.ok")
    @js.native
    def ok(actual: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.property")
    @js.native
    def property(`object`: js.Any, prop: js.Any): Unit = js.native
    @JSImport("test", "assert.property")
    @js.native
    def property(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.propertyNotVal")
    @js.native
    def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
    @JSImport("test", "assert.propertyNotVal")
    @js.native
    def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.propertyVal")
    @js.native
    def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
    @JSImport("test", "assert.propertyVal")
    @js.native
    def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.Any): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    @JSImport("test", "assert.strictEqual")
    @js.native
    def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    
    @JSImport("test", "assert.throws")
    @js.native
    def throws(block: js.Function): Unit = js.native
    @JSImport("test", "assert.throws")
    @js.native
    def throws(block: js.Function, msg: String): Unit = js.native
    
    @JSImport("test", "assert.typeOf")
    @js.native
    def typeOf(actual: js.Any, `type`: String): Unit = js.native
    @JSImport("test", "assert.typeOf")
    @js.native
    def typeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
  }
  
  @JSImport("test", "before")
  @js.native
  def before(func: js.Function): Unit = js.native
  
  @JSImport("test", "beforeEach")
  @js.native
  def beforeEach(func: js.Function): Unit = js.native
  
  @JSImport("test", "describe")
  @js.native
  def describe(name: String, block: js.Function): Unit = js.native
  
  @JSImport("test", "it")
  @js.native
  def it(name: String, block: js.Function): Unit = js.native
  
  @JSImport("test", "odescribe")
  @js.native
  def odescribe(name: String, block: js.Function): Unit = js.native
  
  @JSImport("test", "oit")
  @js.native
  def oit(name: String, block: js.Function): Unit = js.native
  
  @JSImport("test", "run")
  @js.native
  def run(): Double = js.native
  @JSImport("test", "run")
  @js.native
  def run(loglevel: Double): Double = js.native
  
  @JSImport("test", "setup")
  @js.native
  def setup(): Unit = js.native
  
  @JSImport("test", "slow")
  @js.native
  val slow: Double = js.native
  
  @JSImport("test", "xdescribe")
  @js.native
  def xdescribe(name: String, block: js.Function): Unit = js.native
  
  @JSImport("test", "xit")
  @js.native
  def xit(name: String, block: js.Function): Unit = js.native
}
