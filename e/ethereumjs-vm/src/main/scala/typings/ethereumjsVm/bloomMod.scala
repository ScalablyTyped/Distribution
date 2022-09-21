package typings.ethereumjsVm

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloomMod {
  
  @JSImport("ethereumjs-vm/dist/bloom", JSImport.Default)
  @js.native
  /**
    * Represents a Bloom filter.
    */
  open class default ()
    extends StObject
       with Bloom {
    def this(bitvector: Buffer) = this()
    
    /**
      * Adds an element to a bit vector of a 64 byte bloom filter.
      * @param e - The element to add
      */
    /* CompleteClass */
    override def add(e: Buffer): Unit = js.native
    
    /* CompleteClass */
    var bitvector: Buffer = js.native
    
    /**
      * Checks if an element is in the bloom.
      * @param e - The element to check
      */
    /* CompleteClass */
    override def check(e: Buffer): Boolean = js.native
    
    /**
      * Checks if multiple topics are in a bloom.
      * @returns `true` if every topic is in the bloom
      */
    /* CompleteClass */
    override def multiCheck(topics: js.Array[Buffer]): Boolean = js.native
    
    /**
      * Bitwise or blooms together.
      */
    /* CompleteClass */
    override def or(bloom: Bloom): Unit = js.native
  }
  
  trait Bloom extends StObject {
    
    /**
      * Adds an element to a bit vector of a 64 byte bloom filter.
      * @param e - The element to add
      */
    def add(e: Buffer): Unit
    
    var bitvector: Buffer
    
    /**
      * Checks if an element is in the bloom.
      * @param e - The element to check
      */
    def check(e: Buffer): Boolean
    
    /**
      * Checks if multiple topics are in a bloom.
      * @returns `true` if every topic is in the bloom
      */
    def multiCheck(topics: js.Array[Buffer]): Boolean
    
    /**
      * Bitwise or blooms together.
      */
    def or(bloom: Bloom): Unit
  }
  object Bloom {
    
    inline def apply(
      add: Buffer => Unit,
      bitvector: Buffer,
      check: Buffer => Boolean,
      multiCheck: js.Array[Buffer] => Boolean,
      or: Bloom => Unit
    ): Bloom = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), bitvector = bitvector.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), multiCheck = js.Any.fromFunction1(multiCheck), or = js.Any.fromFunction1(or))
      __obj.asInstanceOf[Bloom]
    }
    
    extension [Self <: Bloom](x: Self) {
      
      inline def setAdd(value: Buffer => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setBitvector(value: Buffer): Self = StObject.set(x, "bitvector", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: Buffer => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setMultiCheck(value: js.Array[Buffer] => Boolean): Self = StObject.set(x, "multiCheck", js.Any.fromFunction1(value))
      
      inline def setOr(value: Bloom => Unit): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    }
  }
}
