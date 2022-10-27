organization := "org.scalablytyped"
name := "glue"
version := "5.0-dt-20211223Z-b53872"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-f2e8e0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-24c331",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-068cba",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-121c0e",
  "org.scalablytyped" %%% "joi" % "17.6.4-77dbda",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-0ac956",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-aefc2e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-62aa88",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-c0bf59",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
