package typings.ethereumjsVm

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloomMod {
  
  @JSImport("ethereumjs-vm/dist/bloom", JSImport.Default)
  @js.native
  /**
    * Represents a Bloom filter.
    */
  class default () extends Bloom {
    def this(bitvector: Buffer) = this()
  }
  
  @js.native
  trait Bloom extends StObject {
    
    /**
      * Adds an element to a bit vector of a 64 byte bloom filter.
      * @param e - The element to add
      */
    def add(e: Buffer): Unit = js.native
    
    var bitvector: Buffer = js.native
    
    /**
      * Checks if an element is in the bloom.
      * @param e - The element to check
      */
    def check(e: Buffer): Boolean = js.native
    
    /**
      * Checks if multiple topics are in a bloom.
      * @returns `true` if every topic is in the bloom
      */
    def multiCheck(topics: js.Array[Buffer]): Boolean = js.native
    
    /**
      * Bitwise or blooms together.
      */
    def or(bloom: Bloom): Unit = js.native
  }
  object Bloom {
    
    @scala.inline
    def apply(
      add: Buffer => Unit,
      bitvector: Buffer,
      check: Buffer => Boolean,
      multiCheck: js.Array[Buffer] => Boolean,
      or: Bloom => Unit
    ): Bloom = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), bitvector = bitvector.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), multiCheck = js.Any.fromFunction1(multiCheck), or = js.Any.fromFunction1(or))
      __obj.asInstanceOf[Bloom]
    }
    
    @scala.inline
    implicit class BloomMutableBuilder[Self <: Bloom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Buffer => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBitvector(value: Buffer): Self = StObject.set(x, "bitvector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheck(value: Buffer => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiCheck(value: js.Array[Buffer] => Boolean): Self = StObject.set(x, "multiCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOr(value: Bloom => Unit): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    }
  }
}
