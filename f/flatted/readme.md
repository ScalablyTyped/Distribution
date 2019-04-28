
# Scala.js typings for flatted

Typings are for version 2.0.0

## Library description:
A super light and fast circular JSON parser.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | flatted |
| Keywords           | circular, JSON, fast, parser, minimal |
| # releases         | 12 |
| # dependents       | 59 |
| # downloads        | 22642816 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/WebReflection/flatted#readme)
- [Bugs](https://github.com/WebReflection/flatted/issues)
- [Repository](https://github.com/WebReflection/flatted)
- [Npm](https://www.npmjs.com/package/flatted)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * Fast and minimal circular JSON parser.
 * logic example
```js
 var a = [{one: 1}, {two: '2'}];
a[0].a = a;
// a is the main object, will be at index '0'
// {one: 1} is the second object, index '1'
// {two: '2'} the third, in '2', and it has a string
// which will be found at index '3'

Flatted.stringify(a);
// [["1","2"],{"one":1,"a":"0"},{"two":"3"},"2"]
// a[one,two]    {one: 1, a}    {two: '2'}  '2'
```
 */

```

