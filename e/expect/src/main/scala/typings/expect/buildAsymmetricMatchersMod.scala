package typings.expect

import typings.expect.buildAsymmetricMatchersMod.Any
import typings.expect.buildAsymmetricMatchersMod.Anything
import typings.expect.buildAsymmetricMatchersMod.ArrayContaining
import typings.expect.buildAsymmetricMatchersMod.AsymmetricMatcher
import typings.expect.buildAsymmetricMatchersMod.ObjectContaining
import typings.expect.buildAsymmetricMatchersMod.StringContaining
import typings.expect.buildAsymmetricMatchersMod.StringMatching
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/asymmetricMatchers", JSImport.Namespace)
@js.native
object buildAsymmetricMatchersMod extends js.Object {
  @js.native
  trait Any
    extends AsymmetricMatcher[js.Any] {
    def asymmetricMatch(other: js.Any): Boolean = js.native
    def getExpectedType(): String = js.native
    def toAsymmetricMatcher(): String = js.native
  }
  
  @js.native
  trait Anything extends AsymmetricMatcher[Unit] {
    def asymmetricMatch(other: js.Any): Boolean = js.native
    def toAsymmetricMatcher(): String = js.native
  }
  
  @js.native
  trait ArrayContaining
    extends AsymmetricMatcher[js.Array[js.Any]] {
    def asymmetricMatch(other: js.Array[_]): Boolean = js.native
    def getExpectedType(): String = js.native
  }
  
  @js.native
  class AsymmetricMatcher[T] protected () extends js.Object {
    def this(sample: T) = this()
    @JSName("$$typeof")
    var $$typeof: js.Symbol = js.native
    var inverse: js.UndefOr[Boolean] = js.native
    var sample: T = js.native
  }
  
  @js.native
  trait ObjectContaining
    extends AsymmetricMatcher[Record[String, js.Any]] {
    def asymmetricMatch(other: js.Any): Boolean = js.native
    def getExpectedType(): String = js.native
  }
  
  @js.native
  trait StringContaining extends AsymmetricMatcher[String] {
    def asymmetricMatch(other: String): Boolean = js.native
    def getExpectedType(): String = js.native
  }
  
  @js.native
  trait StringMatching extends AsymmetricMatcher[RegExp] {
    def asymmetricMatch(other: String): Boolean = js.native
    def getExpectedType(): String = js.native
  }
  
  def any(expectedObject: js.Any): Any = js.native
  def anything(): Anything = js.native
  def arrayContaining(sample: js.Array[_]): ArrayContaining = js.native
  def arrayNotContaining(sample: js.Array[_]): ArrayContaining = js.native
  def objectContaining(sample: Record[String, _]): ObjectContaining = js.native
  def objectNotContaining(sample: Record[String, _]): ObjectContaining = js.native
  def stringContaining(expected: String): StringContaining = js.native
  def stringMatching(expected: String): StringMatching = js.native
  def stringMatching(expected: RegExp): StringMatching = js.native
  def stringNotContaining(expected: String): StringContaining = js.native
  def stringNotMatching(expected: String): StringMatching = js.native
  def stringNotMatching(expected: RegExp): StringMatching = js.native
}

