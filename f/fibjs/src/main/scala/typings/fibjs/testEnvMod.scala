package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testEnvMod {
  
  object global {
    
    /* was `typeof test.after` */
    @JSGlobal("after")
    @js.native
    def after(func: js.Function): Unit = js.native
    
    /* was `typeof test.afterEach` */
    @JSGlobal("afterEach")
    @js.native
    def afterEach(func: js.Function): Unit = js.native
    
    /* was `typeof _assert` */
    object assert {
      
      @JSGlobal("assert.Function")
      @js.native
      def Function(): Unit = js.native
      @JSGlobal("assert.Function")
      @js.native
      def Function(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.Function")
      @js.native
      def Function(actual: js.Any): Unit = js.native
      @JSGlobal("assert.Function")
      @js.native
      def Function(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.closeTo")
      @js.native
      def closeTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
      @JSGlobal("assert.closeTo")
      @js.native
      def closeTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.Any): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.deepEqual")
      @js.native
      def deepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.deepProperty")
      @js.native
      def deepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
      @JSGlobal("assert.deepProperty")
      @js.native
      def deepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.deepPropertyNotVal")
      @js.native
      def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
      @JSGlobal("assert.deepPropertyNotVal")
      @js.native
      def deepPropertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.deepPropertyVal")
      @js.native
      def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
      @JSGlobal("assert.deepPropertyVal")
      @js.native
      def deepPropertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.doesNotThrow")
      @js.native
      def doesNotThrow(block: js.Function): Unit = js.native
      @JSGlobal("assert.doesNotThrow")
      @js.native
      def doesNotThrow(block: js.Function, msg: String): Unit = js.native
      
      @JSGlobal("assert.equal")
      @js.native
      def equal(): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.Any): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.equal")
      @js.native
      def equal(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.exist")
      @js.native
      def exist(actual: js.Any): Unit = js.native
      @JSGlobal("assert.exist")
      @js.native
      def exist(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.greaterThan")
      @js.native
      def greaterThan(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.greaterThan")
      @js.native
      def greaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.ifError")
      @js.native
      def ifError(): Unit = js.native
      @JSGlobal("assert.ifError")
      @js.native
      def ifError(`object`: js.Any): Unit = js.native
      
      @JSGlobal("assert.isArray")
      @js.native
      def isArray(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isArray")
      @js.native
      def isArray(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isBoolean")
      @js.native
      def isBoolean(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isBoolean")
      @js.native
      def isBoolean(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isDefined")
      @js.native
      def isDefined(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isDefined")
      @js.native
      def isDefined(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isFalse")
      @js.native
      def isFalse(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isFalse")
      @js.native
      def isFalse(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isFunction")
      @js.native
      def isFunction(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isFunction")
      @js.native
      def isFunction(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotArray")
      @js.native
      def isNotArray(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotArray")
      @js.native
      def isNotArray(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotBoolean")
      @js.native
      def isNotBoolean(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotBoolean")
      @js.native
      def isNotBoolean(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotFalse")
      @js.native
      def isNotFalse(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotFalse")
      @js.native
      def isNotFalse(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotFunction")
      @js.native
      def isNotFunction(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotFunction")
      @js.native
      def isNotFunction(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotNull")
      @js.native
      def isNotNull(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotNull")
      @js.native
      def isNotNull(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotNumber")
      @js.native
      def isNotNumber(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotNumber")
      @js.native
      def isNotNumber(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotObject")
      @js.native
      def isNotObject(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotObject")
      @js.native
      def isNotObject(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotString")
      @js.native
      def isNotString(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotString")
      @js.native
      def isNotString(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNotTrue")
      @js.native
      def isNotTrue(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNotTrue")
      @js.native
      def isNotTrue(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNull")
      @js.native
      def isNull(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNull")
      @js.native
      def isNull(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isNumber")
      @js.native
      def isNumber(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isNumber")
      @js.native
      def isNumber(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isObject")
      @js.native
      def isObject(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isObject")
      @js.native
      def isObject(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isString")
      @js.native
      def isString(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isString")
      @js.native
      def isString(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isTrue")
      @js.native
      def isTrue(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isTrue")
      @js.native
      def isTrue(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.isUndefined")
      @js.native
      def isUndefined(actual: js.Any): Unit = js.native
      @JSGlobal("assert.isUndefined")
      @js.native
      def isUndefined(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.lessThan")
      @js.native
      def lessThan(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.lessThan")
      @js.native
      def lessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notCloseTo")
      @js.native
      def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any): Unit = js.native
      @JSGlobal("assert.notCloseTo")
      @js.native
      def notCloseTo(actual: js.Any, expected: js.Any, delta: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.Any): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.notDeepEqual")
      @js.native
      def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notDeepProperty")
      @js.native
      def notDeepProperty(`object`: js.Any, prop: js.Any): Unit = js.native
      @JSGlobal("assert.notDeepProperty")
      @js.native
      def notDeepProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.Any): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.notEqual")
      @js.native
      def notEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notExist")
      @js.native
      def notExist(actual: js.Any): Unit = js.native
      @JSGlobal("assert.notExist")
      @js.native
      def notExist(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notGreaterThan")
      @js.native
      def notGreaterThan(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.notGreaterThan")
      @js.native
      def notGreaterThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notLessThan")
      @js.native
      def notLessThan(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.notLessThan")
      @js.native
      def notLessThan(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notOk")
      @js.native
      def notOk(): Unit = js.native
      @JSGlobal("assert.notOk")
      @js.native
      def notOk(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notOk")
      @js.native
      def notOk(actual: js.Any): Unit = js.native
      @JSGlobal("assert.notOk")
      @js.native
      def notOk(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notProperty")
      @js.native
      def notProperty(`object`: js.Any, prop: js.Any): Unit = js.native
      @JSGlobal("assert.notProperty")
      @js.native
      def notProperty(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.Any): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.notStrictEqual")
      @js.native
      def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.notTypeOf")
      @js.native
      def notTypeOf(actual: js.Any, `type`: String): Unit = js.native
      @JSGlobal("assert.notTypeOf")
      @js.native
      def notTypeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
      
      @JSGlobal("assert.ok")
      @js.native
      def ok(): Unit = js.native
      @JSGlobal("assert.ok")
      @js.native
      def ok(actual: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.ok")
      @js.native
      def ok(actual: js.Any): Unit = js.native
      @JSGlobal("assert.ok")
      @js.native
      def ok(actual: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.property")
      @js.native
      def property(`object`: js.Any, prop: js.Any): Unit = js.native
      @JSGlobal("assert.property")
      @js.native
      def property(`object`: js.Any, prop: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.propertyNotVal")
      @js.native
      def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
      @JSGlobal("assert.propertyNotVal")
      @js.native
      def propertyNotVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.propertyVal")
      @js.native
      def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any): Unit = js.native
      @JSGlobal("assert.propertyVal")
      @js.native
      def propertyVal(`object`: js.Any, prop: js.Any, value: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.Any): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
      @JSGlobal("assert.strictEqual")
      @js.native
      def strictEqual(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
      
      @JSGlobal("assert.throws")
      @js.native
      def throws(block: js.Function): Unit = js.native
      @JSGlobal("assert.throws")
      @js.native
      def throws(block: js.Function, msg: String): Unit = js.native
      
      @JSGlobal("assert.typeOf")
      @js.native
      def typeOf(actual: js.Any, `type`: String): Unit = js.native
      @JSGlobal("assert.typeOf")
      @js.native
      def typeOf(actual: js.Any, `type`: String, msg: String): Unit = js.native
    }
    
    /* was `typeof test.before` */
    @JSGlobal("before")
    @js.native
    def before(func: js.Function): Unit = js.native
    
    /* was `typeof test.beforeEach` */
    @JSGlobal("beforeEach")
    @js.native
    def beforeEach(func: js.Function): Unit = js.native
    
    /* was `typeof test.describe` */
    @JSGlobal("describe")
    @js.native
    def describe(name: String, block: js.Function): Unit = js.native
    
    /* was `typeof test.it` */
    @JSGlobal("it")
    @js.native
    def it(name: String, block: js.Function): Unit = js.native
    
    /* was `typeof test.odescribe` */
    @JSGlobal("odescribe")
    @js.native
    def odescribe(name: String, block: js.Function): Unit = js.native
    
    /* was `typeof test.oit` */
    @JSGlobal("oit")
    @js.native
    def oit(name: String, block: js.Function): Unit = js.native
    
    /* was `typeof test.run` */
    @JSGlobal("run")
    @js.native
    def run(): Double = js.native
    @JSGlobal("run")
    @js.native
    def run(loglevel: Double): Double = js.native
    
    /* was `typeof test.setup` */
    @JSGlobal("setup")
    @js.native
    def setup(): Unit = js.native
    
    /* was `typeof test.xdescribe` */
    @JSGlobal("xdescribe")
    @js.native
    def xdescribe(name: String, block: js.Function): Unit = js.native
    
    /* was `typeof test.xit` */
    @JSGlobal("xit")
    @js.native
    def xit(name: String, block: js.Function): Unit = js.native
  }
}
