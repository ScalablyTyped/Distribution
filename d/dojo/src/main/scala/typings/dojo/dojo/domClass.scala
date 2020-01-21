package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-class.html
  *
  * This module defines the core dojo DOM class API.
  *
  */
@js.native
trait domClass extends js.Object {
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def add(node: String, classStr: String): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def add(node: String, classStr: js.Array[_]): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def add(node: HTMLElement, classStr: String): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def add(node: HTMLElement, classStr: js.Array[_]): Unit = js.native
  /**
    * Returns whether or not the specified classes are a portion of the
    * class list currently applied to the node.
    *
    * @param node String ID or DomNode reference to check the class for.
    * @param classStr A string class name to look for.
    */
  def contains(node: String, classStr: String): Boolean = js.native
  /**
    * Returns whether or not the specified classes are a portion of the
    * class list currently applied to the node.
    *
    * @param node String ID or DomNode reference to check the class for.
    * @param classStr A string class name to look for.
    */
  def contains(node: HTMLElement, classStr: String): Boolean = js.native
  /**
    * Removes the specified classes from node. No contains()
    * check is required.
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param classStr               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def remove(node: String): Unit = js.native
  def remove(node: String, classStr: String): Unit = js.native
  def remove(node: String, classStr: js.Array[_]): Unit = js.native
  /**
    * Removes the specified classes from node. No contains()
    * check is required.
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param classStr               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def remove(node: HTMLElement): Unit = js.native
  def remove(node: HTMLElement, classStr: String): Unit = js.native
  def remove(node: HTMLElement, classStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replace(node: String, addClassStr: String): Unit = js.native
  def replace(node: String, addClassStr: String, removeClassStr: String): Unit = js.native
  def replace(node: String, addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replace(node: String, addClassStr: js.Array[_]): Unit = js.native
  def replace(node: String, addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def replace(node: String, addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replace(node: HTMLElement, addClassStr: String): Unit = js.native
  def replace(node: HTMLElement, addClassStr: String, removeClassStr: String): Unit = js.native
  def replace(node: HTMLElement, addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replace(node: HTMLElement, addClassStr: js.Array[_]): Unit = js.native
  def replace(node: HTMLElement, addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def replace(node: HTMLElement, addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggle(node: String, classStr: String): Boolean = js.native
  def toggle(node: String, classStr: String, condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggle(node: String, classStr: js.Array[_]): Boolean = js.native
  def toggle(node: String, classStr: js.Array[_], condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggle(node: HTMLElement, classStr: String): Boolean = js.native
  def toggle(node: HTMLElement, classStr: String, condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggle(node: HTMLElement, classStr: js.Array[_]): Boolean = js.native
  def toggle(node: HTMLElement, classStr: js.Array[_], condition: Boolean): Boolean = js.native
}

