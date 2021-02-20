package typings.expect

import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asymmetricMatchersMod {
  
  @JSImport("expect/build/asymmetricMatchers", "AsymmetricMatcher")
  @js.native
  class AsymmetricMatcher[T] protected () extends StObject {
    def this(sample: T) = this()
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var sample: T = js.native
  }
  
  @JSImport("expect/build/asymmetricMatchers", "any")
  @js.native
  def any(expectedObject: js.Any): Any_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "anything")
  @js.native
  def anything(): Anything_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "arrayContaining")
  @js.native
  def arrayContaining(sample: js.Array[_]): ArrayContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "arrayNotContaining")
  @js.native
  def arrayNotContaining(sample: js.Array[_]): ArrayContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "objectContaining")
  @js.native
  def objectContaining(sample: Record[String, _]): ObjectContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "objectNotContaining")
  @js.native
  def objectNotContaining(sample: Record[String, _]): ObjectContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "stringContaining")
  @js.native
  def stringContaining(expected: String): StringContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "stringMatching")
  @js.native
  def stringMatching(expected: String): StringMatching_ = js.native
  @JSImport("expect/build/asymmetricMatchers", "stringMatching")
  @js.native
  def stringMatching(expected: RegExp): StringMatching_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "stringNotContaining")
  @js.native
  def stringNotContaining(expected: String): StringContaining_ = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "stringNotMatching")
  @js.native
  def stringNotMatching(expected: String): StringMatching_ = js.native
  @JSImport("expect/build/asymmetricMatchers", "stringNotMatching")
  @js.native
  def stringNotMatching(expected: RegExp): StringMatching_ = js.native
  
  @js.native
  trait Any_
    extends AsymmetricMatcher[js.Any] {
    
    def asymmetricMatch(other: js.Any): Boolean = js.native
    
    def getExpectedType(): String = js.native
    
    def toAsymmetricMatcher(): String = js.native
  }
  
  @js.native
  trait Anything_ extends AsymmetricMatcher[Unit] {
    
    def asymmetricMatch(other: js.Any): Boolean = js.native
    
    def toAsymmetricMatcher(): String = js.native
  }
  
  @js.native
  trait ArrayContaining_
    extends AsymmetricMatcher[js.Array[js.Any]] {
    
    def asymmetricMatch(other: js.Array[_]): Boolean = js.native
    
    def getExpectedType(): String = js.native
  }
  
  @js.native
  trait ObjectContaining_
    extends AsymmetricMatcher[Record[String, js.Any]] {
    
    def asymmetricMatch(other: js.Any): Boolean = js.native
    
    def getExpectedType(): String = js.native
  }
  
  @js.native
  trait StringContaining_ extends AsymmetricMatcher[String] {
    
    def asymmetricMatch(other: String): Boolean = js.native
    
    def getExpectedType(): String = js.native
  }
  
  @js.native
  trait StringMatching_ extends AsymmetricMatcher[RegExp] {
    
    def asymmetricMatch(other: String): Boolean = js.native
    
    def getExpectedType(): String = js.native
  }
}
