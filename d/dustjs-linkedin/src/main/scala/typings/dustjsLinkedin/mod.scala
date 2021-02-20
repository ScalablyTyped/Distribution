package typings.dustjsLinkedin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dustjs-linkedin", "compile")
  @js.native
  def compile(source: String, name: String): String = js.native
  @JSImport("dustjs-linkedin", "compile")
  @js.native
  def compile(source: String, name: String, strip: Boolean): String = js.native
  
  @JSImport("dustjs-linkedin", "compileFn")
  @js.native
  def compileFn(source: String): Template = js.native
  @JSImport("dustjs-linkedin", "compileFn")
  @js.native
  def compileFn(source: String, name: String): Template = js.native
  
  @JSImport("dustjs-linkedin", "escapeHtml")
  @js.native
  def escapeHtml(html: String): String = js.native
  
  @JSImport("dustjs-linkedin", "escapeJs")
  @js.native
  def escapeJs(js_ : String): String = js.native
  
  @JSImport("dustjs-linkedin", "loadSource")
  @js.native
  def loadSource(compiled: String): Template = js.native
  
  @JSImport("dustjs-linkedin", "makeBase")
  @js.native
  def makeBase(global: js.Any): Context = js.native
  @JSImport("dustjs-linkedin", "makeBase")
  @js.native
  def makeBase(global: Context): Context = js.native
  
  @JSImport("dustjs-linkedin", "register")
  @js.native
  def register(name: String, tmpl: Template): Unit = js.native
  
  @JSImport("dustjs-linkedin", "render")
  @js.native
  def render(name: String, context: js.Any, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  @JSImport("dustjs-linkedin", "render")
  @js.native
  def render(name: String, context: Context, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  
  @JSImport("dustjs-linkedin", "renderSource")
  @js.native
  def renderSource(source: String, context: js.Any): Stream_ = js.native
  @JSImport("dustjs-linkedin", "renderSource")
  @js.native
  def renderSource(source: String, context: js.Any, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  @JSImport("dustjs-linkedin", "renderSource")
  @js.native
  def renderSource(source: String, context: Context): Stream_ = js.native
  @JSImport("dustjs-linkedin", "renderSource")
  @js.native
  def renderSource(source: String, context: Context, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  
  @JSImport("dustjs-linkedin", "stream")
  @js.native
  def stream(name: String, context: js.Any): Stream_ = js.native
  @JSImport("dustjs-linkedin", "stream")
  @js.native
  def stream(name: String, context: Context): Stream_ = js.native
  
  @js.native
  trait Chunk extends StObject {
    
    /**
      * Writes data to this chunk's buffer and marks it as flushable. This method must be called on any chunks created via chunk.map. Do not call this method on a handler's main chunk -- dust.render and dust.stream take care of this for you.
      */
    def end(data: String): Chunk = js.native
    
    /**
      * Creates a new chunk and passes it to callback. Use map to wrap asynchronous functions and to partition the template for streaming.
      */
    def map(callback: js.Function1[/* chunk */ this.type, _]): Chunk = js.native
    
    /**
      * Renders a template block, such as a default block or an else block.
      */
    def render(body: js.Any, context: Context): Chunk = js.native
    
    /**
      * Sets an error on this chunk and immediately flushes the output.
      */
    def setError(err: js.Any): Chunk = js.native
    
    /**
      * Convenience method to apply filters to a stream.
      */
    def tap(callback: js.Function1[/* value */ js.Any, _]): Chunk = js.native
    
    /**
      * Removes the head tap function from the list.
      */
    def untap(): Chunk = js.native
    
    /**
      * Writes data to this chunk's buffer. 
      */
    def write(data: String): Chunk = js.native
  }
  object Chunk {
    
    @scala.inline
    def apply(
      end: String => Chunk,
      map: js.Function1[Chunk, _] => Chunk,
      render: (js.Any, Context) => Chunk,
      setError: js.Any => Chunk,
      tap: js.Function1[/* value */ js.Any, _] => Chunk,
      untap: () => Chunk,
      write: String => Chunk
    ): Chunk = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), map = js.Any.fromFunction1(map), render = js.Any.fromFunction2(render), setError = js.Any.fromFunction1(setError), tap = js.Any.fromFunction1(tap), untap = js.Any.fromFunction0(untap), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String => Chunk): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: js.Function1[Chunk, _] => Chunk): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRender(value: (js.Any, Context) => Chunk): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetError(value: js.Any => Chunk): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTap(value: js.Function1[/* value */ js.Any, _] => Chunk): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUntap(value: () => Chunk): Self = StObject.set(x, "untap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrite(value: String => Chunk): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    /**
      * Returns the head of the context stack.
      */
    def current(): js.Any = js.native
    
    /**
      * Retrieves the value at key from the context stack.
      */
    def get(key: String): js.Any = js.native
    
    /**
      * Pushes an arbitrary value onto the context stack and returns a new context instance. Specify index and/or length to enable enumeration helpers.
      */
    def push(head: js.Any): Context = js.native
    def push(head: js.Any, idx: js.UndefOr[scala.Nothing], len: Double): Context = js.native
    def push(head: js.Any, idx: Double): Context = js.native
    def push(head: js.Any, idx: Double, len: Double): Context = js.native
    
    /**
      * Returns a new context instance consisting only of the value at head, plus any previously defined global object.
      */
    def rebase(head: js.Any): Context = js.native
  }
  
  @js.native
  trait Stream_ extends StObject {
    
    def emit(evt: String, data: js.Any): Unit = js.native
    
    def flush(): Unit = js.native
    
    /*
      * Registers an event listener. Streams accept a single listener for a given event.
      * @param evt the event. Possible values are data, end, error (maybe more, look in the source).
      */
    def on(evt: String, callback: js.Function1[/* data */ js.UndefOr[js.Any], _]): this.type = js.native
    
    def pipe(stream: Stream_): Stream_ = js.native
  }
  object Stream_ {
    
    @scala.inline
    def apply(
      emit: (String, js.Any) => Unit,
      flush: () => Unit,
      on: (String, js.Function1[/* data */ js.UndefOr[js.Any], _]) => Stream_,
      pipe: Stream_ => Stream_
    ): Stream_ = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), flush = js.Any.fromFunction0(flush), on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
      __obj.asInstanceOf[Stream_]
    }
    
    @scala.inline
    implicit class Stream_MutableBuilder[Self <: Stream_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (String, js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* data */ js.UndefOr[js.Any], _]) => Stream_): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPipe(value: Stream_ => Stream_): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    }
  }
  
  type Template = js.Function2[/* chk */ Chunk, /* ctx */ Context, Chunk]
}
