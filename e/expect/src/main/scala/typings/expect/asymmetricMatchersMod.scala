package typings.expect

import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asymmetricMatchersMod {
  
  @JSImport("expect/build/asymmetricMatchers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expect/build/asymmetricMatchers", "AsymmetricMatcher")
  @js.native
  class AsymmetricMatcher[T] protected () extends StObject {
    def this(sample: T) = this()
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var sample: T = js.native
  }
  
  @scala.inline
  def any(expectedObject: js.Any): Any_ = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(expectedObject.asInstanceOf[js.Any]).asInstanceOf[Any_]
  
  @scala.inline
  def anything(): Anything_ = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[Anything_]
  
  @scala.inline
  def arrayContaining(sample: js.Array[js.Any]): ArrayContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining_]
  
  @scala.inline
  def arrayNotContaining(sample: js.Array[js.Any]): ArrayContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining_]
  
  @scala.inline
  def objectContaining(sample: Record[String, js.Any]): ObjectContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ObjectContaining_]
  
  @scala.inline
  def objectNotContaining(sample: Record[String, js.Any]): ObjectContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectNotContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ObjectContaining_]
  
  @scala.inline
  def stringContaining(expected: String): StringContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringContaining")(expected.asInstanceOf[js.Any]).asInstanceOf[StringContaining_]
  
  @scala.inline
  def stringMatching(expected: String): StringMatching_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(expected.asInstanceOf[js.Any]).asInstanceOf[StringMatching_]
  @scala.inline
  def stringMatching(expected: RegExp): StringMatching_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(expected.asInstanceOf[js.Any]).asInstanceOf[StringMatching_]
  
  @scala.inline
  def stringNotContaining(expected: String): StringContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringNotContaining")(expected.asInstanceOf[js.Any]).asInstanceOf[StringContaining_]
  
  @scala.inline
  def stringNotMatching(expected: String): StringMatching_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringNotMatching")(expected.asInstanceOf[js.Any]).asInstanceOf[StringMatching_]
  @scala.inline
  def stringNotMatching(expected: RegExp): StringMatching_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringNotMatching")(expected.asInstanceOf[js.Any]).asInstanceOf[StringMatching_]
  
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
    
    def asymmetricMatch(other: js.Array[js.Any]): Boolean = js.native
    
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
